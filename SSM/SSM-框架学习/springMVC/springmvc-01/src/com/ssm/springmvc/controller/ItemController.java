package com.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	
	@RequestMapping(value = "/itemList")
	public String itemTest() {
		// ModelAndView mav = new ModelAndView();
		// mav.setViewName("/WEB-INF/jsp/itemList.jsp");
		
		return "itemList";
	}
}
