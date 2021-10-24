<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing details</title>
</head>
<body>
<div class="container mt-3">

		<h1>Edit Student detail</h1>
		<form action="updateStudentdetail" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="id">Id</label> <input type="text"
							value="${studentdetail.id}" class="form-control" id="id" name="id"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							value="${studentdetail.name }" class="form-control" id="name"
							name="name" placeholder="Enter Name">
					</div>
				</div>
							</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="department">Department</label> <input
							type="text" class="form-control" id="department"
							value="${studentdetail.department }" name="department"
							placeholder="Enter department">
					</div>
				</div>
				
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="address">Address</label>
						<textarea class="form-control" id="address" name="address"
							rows="5" placeholder="Enter Address"> ${studentdetail.address } </textarea>
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
</body>
</html>
