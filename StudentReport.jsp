<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student report</title>
</head>
<body>
<div class="container mt-3">

		<h1>Add Student Detail</h1>
		<a href="addStudentdetail" class="btn btn-primary"> Add Studentdetail </a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Department</th>
						<th scope="col">Address</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${studentdetail}">
						<tr>
							<td class="table-plus">${stu.id}</td>
							<td>${stu.name}</td>
							<td>${stu.department}</td>
							<td>${stu.address}</td>
							<td><a href="editStudentdetail/${stu.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteStudentdetail/${stu.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
