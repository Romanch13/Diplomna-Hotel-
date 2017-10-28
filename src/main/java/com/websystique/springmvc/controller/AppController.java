package com.websystique.springmvc.controller;

// import java util
import java.util.List;
import java.util.Locale;
//import valid
import javax.validation.Valid;
//import springframework
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import websystiqu.springframework
import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.service.EmployeeService;
@Controller //вказує на те, що цей клас є головним, який обробляє запити з шаблоном, позначеним @ RequestMapping
@RequestMapping("/") 
public class AppController {
 
    @Autowired
    EmployeeService service;
     
    @Autowired
    MessageSource messageSource;
 
    /*
     * Цей метод показує список усіх існуючих працівників.
     */
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        return "allemployees";
    }
 
    /*
     * Цей метод забезпечить середовище для додавання нового співробітника.
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newEmployee(ModelMap model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("edit", false);
        return "registration";
    }
 
    /*
     * Цей метод буде викликаний під час подання форми, обробки запиту POST 
     * для збереження співробітника в базі даних. Він також перевіряє введення користувача
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveEmployee(@Valid Employee employee, BindingResult result,
            ModelMap model) {
        if (result.hasErrors()) {
            return "registration";
        }
 
        /*
         * Переважним способом досягнення унікальності поля [ssn] має бути реалізованим за допомогою спеціальною
         * анотацією @Unique та застосовує її у полі [ssn] класу Модель [Employee].
         * 
         * Нижче представлено код в [if block] він демонструє те що можна заповнити власні помилки за межами системи (validation)
         * а також при  цьому використовувати багатомовні повідомлення
         * 
         */
        if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
            result.addError(ssnError);
            return "registration";
        }
         
        service.saveEmployee(employee);
 
        model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
        return "success";
    }
 
 
    /*
     * Цей метод оновлює дані існуючого працівника.
     */
    @RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.GET)
    public String editEmployee(@PathVariable String ssn, ModelMap model) {
        Employee employee = service.findEmployeeBySsn(ssn);
        model.addAttribute("employee", employee);
        model.addAttribute("edit", true);
        return "registration";
    }
     
    /*
     * Цей метод буде викликатися при відправці форми, обробки за запитом після оновлення співробітників в базі даних.
     * Він також перевіряє введення користувача
     */
    @RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.POST)
    public String updateEmployee(@Valid Employee employee, BindingResult result,
            ModelMap model, @PathVariable String ssn) {
 
        if (result.hasErrors()) {
            return "registration";
        }
 
        if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
            result.addError(ssnError);
            return "registration";
        }
 
        service.updateEmployee(employee);
 
        model.addAttribute("success", "Employee " + employee.getName()  + " updated successfully");
        return "success";
    }
 
     
    /*
     * Цей метод буде видаляти працівника за його значенням SSN.
     */
    @RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable String ssn) {
        service.deleteEmployeeBySsn(ssn);
        return "redirect:/list";
    }
 
}