package com.mertgeren.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mertgeren.entity.Meeting;

@Repository
public class MeetingDAOImpl implements MeetingDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;						//spring-mvc-crud-demo-servlet.xml dosyasındaki Step 2
	
	@Override
	@Transactional
	public List<Meeting> getMeetings() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Meeting> theQuery = currentSession.createQuery("from Meeting", Meeting.class);
		
		// execute query and get result list
		List<Meeting> meetings = theQuery.getResultList();
		
		// return the results
		return meetings;
	}

}
