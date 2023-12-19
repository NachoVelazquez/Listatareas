package com.CMEPPS.listatareas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestParam;

import com.CMEPPS.listatareas.model.Hours;
import com.CMEPPS.listatareas.service.IHoursService;

@Controller
public class HoursController {

	@Autowired
	private IHoursService hoursService;

	public String addHours(ModelMap model, @Validated Hours hours, BindingResult result) {
		if (result.hasErrors()) {
			return "hours";
		}

		hours.setUsername(getLoggedInUserName(model));
		hoursService.saveHours(hours);
		return "redirect:/list-todos";
	}

	public String updateHours(ModelMap model, @Validated Hours hours, BindingResult result) {
		if (result.hasErrors()) {
			return "hours";
		}

		hours.setUsername(getLoggedInUserName(model));
		hoursService.updateHours(hours);
		return "redirect:/list-hours";
	}

	public String showHours(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("hours", hoursService.getTodosByUser(name));
		return "list-hours";
	}

	public String deleteHours(@RequestParam long id) {
		hoursService.deleteHours(id);
		return "reditect:/list-hours";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}
}
