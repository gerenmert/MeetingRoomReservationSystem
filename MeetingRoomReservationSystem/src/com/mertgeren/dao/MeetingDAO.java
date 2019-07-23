package com.mertgeren.dao;

import java.util.List;

import com.mertgeren.entity.Meeting;

public interface MeetingDAO {

	public List<Meeting> getMeetings();
	
	public void saveMeeting(Meeting theMeeting);
	
	public Meeting getMeeting(int theId);
}
