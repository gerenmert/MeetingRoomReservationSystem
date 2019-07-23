package com.mertgeren.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mertgeren.dao.MeetingDAO;
import com.mertgeren.entity.Meeting;
import com.mertgeren.service.MeetingService;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
	
	// need to inject the meeting dao
	//@Autowired
	//private MeetingDAO meetingDAO;
	
	// need to inject our meeting service
	@Autowired
	private MeetingService meetingService;

	@GetMapping("/list")
	public String listMeetings(Model theModel) {
		
		// get meetings from the service
		List<Meeting> theMeetings = meetingService.getMeetings();
		
		// add the meetings to the model
		theModel.addAttribute("meetings", theMeetings);					// name - value
		
		return "list-meetings";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Meeting theMeeting = new Meeting();
		
		theModel.addAttribute("meeting", theMeeting);
		
		return "meeting-form";
	}
}