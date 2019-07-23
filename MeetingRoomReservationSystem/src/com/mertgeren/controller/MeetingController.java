package com.mertgeren.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mertgeren.dao.MeetingDAO;
import com.mertgeren.entity.Meeting;
import com.mertgeren.service.MeetingService;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
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
	
	@RequestMapping("/saveCustomer")
	public String saveMeeting(@Valid @ModelAttribute("meeting") Meeting theMeeting, BindingResult theBindingResult) {
		
		// save the customer using our service 
		if(theBindingResult.hasErrors()) {
			return "redirect:/meeting/showFormForAdd";
		}
		else {
			meetingService.saveMeeting(theMeeting);
			return "redirect:/meeting/list";
		}
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("meetingId") int theId, Model theModel) {
		
		// get the meeting from the database
		Meeting theMeeting = meetingService.getMeeting(theId);
		
		// set meeting as a model attribute to pre-populate the form
		theModel.addAttribute("meeting", theMeeting);													//meeting-form sayfasındaki formumuzun modelAttribute değeri ile aynı olmak zorunda
		
		// send over to our form
		return "meeting-form";
	}
	
	@GetMapping("/delete")
	public String deleteMeeting(@RequestParam("meetingId") int theId) {
		
		// delete the meeting
		meetingService.deleteMeeting(theId);
		
		return "redirect:/meeting/list";
	}
	
	@GetMapping("/search")
    public String searchMeetings(@RequestParam("theSearchRoomNo") String theSearchRoomNo, Model theModel) {

        // search meetings from the service
        List<Meeting> theMeetings = meetingService.searchMeetings(theSearchRoomNo);
                
        // add the customers to the model
        theModel.addAttribute("meetings", theMeetings);

        return "list-meetings";        
    }
}