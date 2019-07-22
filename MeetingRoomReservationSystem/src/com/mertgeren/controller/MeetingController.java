package com.mertgeren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
	
	@RequestMapping("/list")
	public String listDetails(Model theModel) {
		
		return "list-meetings";
	}
}