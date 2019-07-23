package com.mertgeren.service;

import java.util.List;

import com.mertgeren.entity.Meeting;

public interface MeetingService {

	public List<Meeting> getMeetings();
	
	public void saveMeeting(Meeting theMeeting);
	
	public Meeting getMeeting(int theId);

	public void deleteMeeting(int theId);

	public List<Meeting> searchMeetings(String theSearchRoomNo);
}
