<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-meeting-style.css"/>
	
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>SNI - Meeting Room Reservation System</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Meeting</h3>
		<form:form action="saveCustomer" modelAttribute="meeting" method="POST">
			<table>
				<tbody>
					<tr>
						<td>Name of Booking Owner:</td>
						<td><form:input path="bookingOwnerName"/></td>
					</tr>
					<tr>
						<td>Surname of Booking Owner:</td>
						<td><form:input path="bookingOwnerSurname"/></td>
					</tr>
					<tr>
						<td>Meeting Room:</td>
						<td>
							<form:select class="select"  path="meetingRoomNo">
								<form:option value="1" label="Room 1"/>
								<form:option value="2" label="Room 2"/>
								<form:option value="3" label="Room 3"/>
								<form:option value="4" label="Room 4"/>
							</form:select> 
						</td>																
					</tr>
					<tr>
						<td>Booking Date:</td>
						<td><form:input type="date" path="bookingDate"/></td>
					</tr>
					<tr>
						<td>Start Time:</td>
						<td><form:input type="time" path="startTime"/></td>
					</tr>
					<tr>
						<td>Finish Time:</td>
						<td><form:input type="time" path="finishTime"/></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"/></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<div style="clear; both;"></div>
		<p>
			<a href="${pageContext.request.contextPath}/meeting/list">Back to List</a>
		</p>
	</div>

</body>
</html>