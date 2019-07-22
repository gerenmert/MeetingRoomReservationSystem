package com.mertgeren.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity							//persistence import
@Table(name = "meetings")		//persistence import
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "bookingOwnerName")
	private String bookingOwnerName;
	
	@Column(name = "bookingOwnerSurname")
	private String bookingOwnerSurname;
	
	@Column(name = "meetingRoomNo")
	private String meetingRoomNo;
	
	@Column(name = "bookingDate")
	private Date bookingDate;
	
	@Column(name = "startTime")
	private String startTime;
	
	@Column(name = "finishTime")
	private String finishTime;
	
	public Meeting() {
		
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", bookingOwnerName=" + bookingOwnerName + ", bookingOwnerSurname="
				+ bookingOwnerSurname + ", meetingRoomNo=" + meetingRoomNo + ", bookingDate=" + bookingDate
				+ ", startTime=" + startTime + ", finishTime=" + finishTime + "]";
	}
}
