<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>

<html>

<head>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>SNI - Meeting Room Reservation System</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<input type="button" value="Add Meeting" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
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
						<td> ${tempMeeting.bookingOwnerName} </td>
						<td> ${tempMeeting.bookingOwnerSurname} </td>
						<td> ${tempMeeting.meetingRoomNo} </td>
						<td> ${tempMeeting.bookingDate} </td>
						<td> ${tempMeeting.startTime} </td>
						<td> ${tempMeeting.finishTime} </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>