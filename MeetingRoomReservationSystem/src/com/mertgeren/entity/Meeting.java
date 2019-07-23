package com.mertgeren.entity;

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
	private String bookingDate;
	
	@Column(name = "startTime")
	private String startTime;
	
	@Column(name = "finishTime")
	private String finishTime;
	
	public Meeting() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBookingOwnerName() {
		return bookingOwnerName;
	}
	
	public void setBookingOwnerName(String bookingOwnerName) {
		this.bookingOwnerName = bookingOwnerName;
	}
	
	public String getBookingOwnerSurname() {
		return bookingOwnerSurname;
	}
	
	public void setBookingOwnerSurname(String bookingOwnerSurname) {
		this.bookingOwnerSurname = bookingOwnerSurname;
	}
	
	public String getMeetingRoomNo() {
		return meetingRoomNo;
	}
	
	public void setMeetingRoomNo(String meetingRoomNo) {
		this.meetingRoomNo = meetingRoomNo;
	}
	
	public String getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getFinishTime() {
		return finishTime;
	}
	
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	
	@Override
	public String toString() {
		return "Meeting [id=" + id + ", bookingOwnerName=" + bookingOwnerName + ", bookingOwnerSurname="
				+ bookingOwnerSurname + ", meetingRoomNo=" + meetingRoomNo + ", bookingDate=" + bookingDate
				+ ", startTime=" + startTime + ", finishTime=" + finishTime + "]";
	}
}
