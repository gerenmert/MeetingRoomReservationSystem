package com.mertgeren.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mertgeren.dao.MeetingDAO;
import com.mertgeren.entity.Meeting;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
	
	// need to inject the meeting dao
	@Autowired
	private MeetingDAO meetingDAO;

	@GetMapping("/list")
	public String listMeetings(Model theModel) {
		
		// get meetings from the dao
		List<Meeting> theMeetings = meetingDAO.getMeetings();
		
		// add the meetings to the model
		theModel.addAttribute("meetings", theMeetings);					// name - value
		
		return "list-meetings";
	}
}