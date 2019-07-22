<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>

<html>

<head>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>SNI - Meeting Room Reservation System</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Name of Booking Owner</th>
					<th>Surname of Booking Owner</th>
					<th>Meeting Room No</th>
					<th>Booking Date</th>
					<th>Start Time</th>
					<th>Finish Time</th>
				</tr>
				<c:forEach var="tempMeeting" items="${meetings}">								<!-- Controller sınıfındaki theModel.addAttribute("meetings", theMeetings); parametresi ile aynı olmalı -->
					<tr>
						<th> ${tempMeeting.bookingOwnerName} </th>
						<th> ${tempMeeting.bookingOwnerSurname} </th>
						<th> ${tempMeeting.meetingRoomNo} </th>
						<th> ${tempMeeting.bookingDate} </th>
						<th> ${tempMeeting.startTime} </th>
						<th> ${tempMeeting.finishTime} </th>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>