<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>

<html>

<head>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
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
					<th>Action</th>
				</tr>
				<c:forEach var="tempMeeting" items="${meetings}">							<!-- Controller sınıfındaki theModel.addAttribute("meetings", theMeetings); parametresi ile aynı olmalı -->
				
					<c:url var="updateLink" value="/meeting/showFormForUpdate">
						<c:param name="meetingId" value="${tempMeeting.id}"/>
					</c:url>
					
					<c:url var="deleteLink" value="/meeting/delete">
						<c:param name="meetingId" value="${tempMeeting.id}"/>
					</c:url>
					
					<tr>
						<td> ${tempMeeting.bookingOwnerName} </td>
						<td> ${tempMeeting.bookingOwnerSurname} </td>
						<td> ${tempMeeting.meetingRoomNo} </td>
						<td> ${tempMeeting.bookingDate} </td>
						<td> ${tempMeeting.startTime} </td>
						<td> ${tempMeeting.finishTime} </td>
						<td> <a href="${updateLink}"> <i class="fas fa-edit"></i> | <a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this customer'))) return false"> <i class="fas fa-trash-alt"></i> </a> </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>