package com.mertgeren.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mertgeren.dao.MeetingDAO;
import com.mertgeren.entity.Meeting;

@Service
public class MeetingServiceImpl implements MeetingService {

	// need inject meeting dao
	@Autowired
	private MeetingDAO meetingDAO;
	
	@Override
	@Transactional
	public List<Meeting> getMeetings() {
		return meetingDAO.getMeetings();
	}

}
