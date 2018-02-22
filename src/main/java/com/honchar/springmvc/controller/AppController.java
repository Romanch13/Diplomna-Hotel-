package com.honchar.springmvc.controller;

import java.util.List;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.honchar.springmvc.model.Guests;
import com.honchar.springmvc.service.GuestsService;

@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	GuestsService service;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listGuests(ModelMap model) {
		
		List<Guests> guests = service.findAllGuests();
		model.addAttribute("guests", guests);
		return "allguestss";
	}
	
	@RequestMapping(value =  {"/new" }, method = RequestMethod.GET)
	public String newGuests(ModelMap model) {
		Guests guests = new Guests();
		model.addAttribute("guests", guests);
		model.addAttribute("edit", false);
		return "registration";
	}
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveGuests(@Valid Guests guests, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		
		if(!service.isGuestsPaymentUinque(guests.getId(), guests.getPayment())) {
			FieldError paymentError = new FieldError("guests","payment", messageSource.getMessage("non.uique.payment", new String[] {guests.getPayment()}, Locale.getDefault()));
			result.addError(paymentError);
			return "registration";
		}
		
		service.saveGuests(guests);
		model.addAttribute("success", "Guests " + guests.getName() + " registered successfully");
		return "success";
		
	}
	
	@RequestMapping(value =  { "/edit-{payment}-guests" }, method = RequestMethod.GET)
	public String editGuests(@PathVariable String payment, ModelMap model) {
		Guests guests = service.findGuestsByPayment(payment);
		model.addAttribute("guests", guests);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	@RequestMapping(value =  { "/edit-{payment}-guests" }, method = RequestMethod.POST)
	public String updateGuests(@Valid Guests guests, BindingResult result,
			ModelMap model, @PathVariable String payment) {
		
		if (result.hasErrors()) {
			return "registration";
		}
		
		if(!service.isGuestsPaymentUinque(guests.getId(), guests.getPayment())) {
			FieldError paymentError = new FieldError("guests","payment", messageSource.getMessage("non.uique.payment", new String[] {guests.getPayment()}, Locale.getDefault()));
			result.addError(paymentError);
			return "registration";
		}
		
		service.updateGuests(guests);
		
		model.addAttribute("success", "Guests " + guests.getName() + " update successfully");
		return "success";

	}
	
	@RequestMapping(value = { "/delete-{payment}-guests"}, method =  RequestMethod.GET)
	public String deleteGuests(@PathVariable String payment) {
		service.deleteGuestsByPayment(payment);
		return "redirect:/list";
	}
	
	
	
}