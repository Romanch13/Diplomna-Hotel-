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
import com.honchar.springmvc.service.GuestsService1;

@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	GuestsService1 service;
	
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
		
		if(!service.isGuestsIdUinque(guests.getId())) {
			FieldError idError = new FieldError("guests","id", messageSource.getMessage("non.uique.id", new Integer[] {guests.getId()}, Locale.getDefault()));
			result.addError(idError);
			return "registration";
		}
		
		service.saveGuests(guests);
		model.addAttribute("success", "Новий Гість " + guests.getName() + " registered successfully");
		return "success";
		
	}
	
	@RequestMapping(value =  { "/edit-{id}-guests" }, method = RequestMethod.GET)
	public String editGuests(@PathVariable int id, ModelMap model) {
		Guests guests = service.findGuestsById(id);
		model.addAttribute("guests", guests);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	@RequestMapping(value =  { "/edit-{id}-guests" }, method = RequestMethod.POST)
	public String updateGuests(@Valid Guests guests, BindingResult result,
			ModelMap model, @PathVariable int id) {
		
		if (result.hasErrors()) {
			return "registration";
		}
		
		if(!service.isGuestsIdUinque(guests.getId())) {
			FieldError idError = new FieldError("guests","id", messageSource.getMessage("non.uique.id", new Integer[] {guests.getId()}, Locale.getDefault()));
			result.addError(idError);
			return "registration";
		}
		
		service.updateGuests(guests);
		
		model.addAttribute("success", "Новий Гість " + guests.getName() + " update successfully");
		return "success";

	}
	
	@RequestMapping(value = { "/delete-{id}-guests"}, method =  RequestMethod.GET)
	public String deleteGuests(@PathVariable int id) {
		service.deleteGuestsById(id);
		return "redirect:/list";
	}
	
	
	
}