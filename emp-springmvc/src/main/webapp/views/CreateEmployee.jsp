<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Registration Form</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<!-- <script src="./form.js"></script> -->

</head>
<body style="background: lightsteelblue">
<!-- <script src="form.js"></script> -->
<a href="location.href='../login/updateEmployee'">update employee</a>
	<p class="h3" style="margin-left: 20%">Basic Employee Information</p>
	<hr>
	<form action="../login/createEmployee" method="post">
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Id</label> <input name="id"
					type="number" class="form-control" placeholder="Id">
			</div>
			<div class="col-3">
				<label for="empInfo">Joining Date</label> <input name="date"
					type="date" class="form-control" placeholder="yyyy-MM-dd">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="password1">Enter Password</label> <input
					name="password1" type="password" onkeyup='validateForm()'
					class="form-control" placeholder="Enter Password">
			</div>
			<div class="col-3">
				<label for="empInfo">Confirm Password</label> <input type="password"
					name="password2" onkeyup='validateForm()' class="form-control"
					placeholder="Confirm Password">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Full Name</label> <input name="ename"
					type="text" class="form-control" placeholder="Full Name">
			</div>
			<div class="col-3">
				<label for="empInfo">Email Id</label> <input type="text"
					name="email" class="form-control" placeholder="Email Id">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Age</label> <input type="number" name="eage"
					class="form-control" placeholder="Age">
			</div>
			<div class="col-3">
				<label for="empInfo">Designation</label> <input name="edesignation"
					type="text" class="form-control" placeholder="Designation">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="inputGender">Gender</label> <select id="inputGender"
					name="egender" class="form-control">
					<option selected>--select one--</option>
					<option value="Male">Male</option>
					<option value="Female">Female</option>
					<option value="Other">Other</option>
				</select>
			</div>
			<div class="col-3">
				<label for="empInfo">Date of Birth</label> <input name="edob"
					type="date" class="form-control" placeholder="yyyy-MM-dd">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Annual Salary</label> <input name="esalary"
					type="number" class="form-control" placeholder="Salary">
			</div>
			<div class="col-3">
				<label for="empInfo">Department Id</label> <input name="edeptid"
					type="number" class="form-control" placeholder="Department Id">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Contact Number</label> <input name="ephone"
					type="number" class="form-control" placeholder="Phone Number">
			</div>
			<div class="col-3">
				<label for="empInfo">Manager Id</label> <input name="managerId.id"
					type="number" class="form-control" placeholder="Manager Id">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Bank Account Number</label> <input
					name="eaccount" type="number" class="form-control"
					placeholder="Account Number">
			</div>
		</div><br><br><br><br>
		<p class="h4" style="margin-left: 20%">Employee Other Information</p>
        <br>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Pan</label> <input name="employeeOtherInfoBean.pan"
					type="text" class="form-control" placeholder="pan number">
			</div>
			<div class="col-3">
				<label for="empInfo">Is married</label> <input name="employeeOtherInfoBean.ismarried"
					type="text" class="form-control" placeholder="Is married">
					<select id="inputGender"
					name="gender" class="form-control">
					<option selected>--select one--</option>
					<option value="true">yes</option>
					<option value="false">no</option></select>
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Blood group</label> <input name="employeeOtherInfoBean.blood"
					type="text" class="form-control" placeholder="Blood group">
			</div>
			<div class="col-3">
				<label for="empInfo">Is challanged</label> <input name="employeeOtherInfoBean.ischallanged"
					type="text" class="form-control" placeholder="Is challanged">
					<select id="inputGender"
					name="gender" class="form-control">
					<option selected>--select one--</option>
					<option value="true">yes</option>
					<option value="false">no</option></select>
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Emergency Number</label> <input name="employeeOtherInfoBean.emergencynum"
					type="number" class="form-control" placeholder="Emergency Number">
			</div>
			<div class="col-3">
				<label for="empInfo">Emergency contact name</label> <input name="employeeOtherInfoBean.emergencycontact"
					type="text" class="form-control" placeholder="Emergency contact name">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Nationality</label> <input name="employeeOtherInfoBean.nationality"
					type="text" class="form-control" placeholder="Nationality">
			</div>
			<div class="col-3">
				<label for="empInfo">Religion</label> <input name="employeeOtherInfoBean.religion"
					type="text" class="form-control" placeholder="Religion">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Father name</label> <input name="employeeOtherInfoBean.fatherName"
					type="text" class="form-control" placeholder="Father name">
			</div>
			<div class="col-3">
				<label for="empInfo">Mother name</label> <input name="employeeOtherInfoBean.mother"
					type="text" class="form-control" placeholder="Mother name">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Spouse</label> <input name="employeeOtherInfoBean.spouse"
					type="text" class="form-control" placeholder="Spouse">
			</div>
			<div class="col-3">
				<label for="empInfo">Passport</label> <input name="employeeOtherInfoBean.passport"
					type="text" class="form-control" placeholder="Passport">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Aadhar</label> <input name="eAadhar"
					type="text" class="form-control" placeholder="Aadhar">
			</div>
			
		</div>
		
        
        <br><br><br><br>
        <p class="h4" style="margin-left: 20%">Employee Address Information</p>
        <br>
		<div class="row">
			<div class="col-1"></div>
			
			<div class="col-3">
				<label for="empInfo">addressType</label> <input name="addressInfoBean[0].addressPkBean.addressType"
					type="text" class="form-control" placeholder="addressType">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">addressOne</label> <input name="addressInfoBean[0].addressOne"
					type="text" class="form-control" placeholder="addressOne">
			</div>
			<div class="col-3">
				<label for="empInfo">addressTwo</label> <input name="addressInfoBean[0].addressTwo"
					type="text" class="form-control" placeholder="addressTwo">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">landmark</label> <input name="addressInfoBean[0].landmark"
					type="text" class="form-control" placeholder="landmark">
			</div>
			<div class="col-3">
				<label for="empInfo">city</label> <input name="addressInfoBean[0].city"
					type="text" class="form-control" placeholder="city">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">state</label> <input name="addressInfoBean[0].state"
					type="text" class="form-control" placeholder="state">
			</div>
			<div class="col-3">
				<label for="empInfo">country</label> <input name="addressInfoBean[0].country"
					type="text" class="form-control" placeholder="country">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">pincode</label> <input name="addressInfoBean[0].pincode"
					type="number" class="form-control" placeholder="pincode">
			</div>
			
        </div>
        
        <br>
		<div class="row">
			<div class="col-1"></div>
			
			<div class="col-3">
				<label for="empInfo">addressType</label> <input name="addressInfoBean[1].addressPkBean.addressType"
					type="text" class="form-control" placeholder="addressType">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">addressOne</label> <input name="addressInfoBean[1].addressOne"
					type="text" class="form-control" placeholder="addressOne">
			</div>
			<div class="col-3">
				<label for="empInfo">addressTwo</label> <input name="addressInfoBean[1].addressTwo"
					type="text" class="form-control" placeholder="addressTwo">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">landmark</label> <input name="addressInfoBean[1].landmark"
					type="text" class="form-control" placeholder="landmark">
			</div>
			<div class="col-3">
				<label for="empInfo">city</label> <input name="addressInfoBean[1].city"
					type="text" class="form-control" placeholder="city">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">state</label> <input name="addressInfoBean[1].state"
					type="text" class="form-control" placeholder="state">
			</div>
			<div class="col-3">
				<label for="empInfo">country</label> <input name="addressInfoBean[1].country"
					type="text" class="form-control" placeholder="country">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">pincode</label> <input name="addressInfoBean[1].pincode"
					type="number" class="form-control" placeholder="pincode">
			</div>
			
		</div>
		
		
        <br><br><br><br>
        <p class="h4" style="margin-left: 20%">Employee Education Information</p>
        <br>
		<div class="row">
			<div class="col-1"></div>
			
			<div class="col-3">
				<label for="empInfo">educationType</label> <input name="educationInfoBean[0].educationPkBean.educationType"
					type="text" class="form-control" placeholder="educationType">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">degreeType</label> <input name="educationInfoBean[0].degreeType"
					type="text" class="form-control" placeholder="degreeType">
			</div>
			<div class="col-3">
				<label for="empInfo">branch</label> <input name="educationInfoBean[0].branch"
					type="text" class="form-control" placeholder="branch">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">collegename</label> <input name="educationInfoBean[0].collegename"
					type="text" class="form-control" placeholder="collegename">
			</div>
			<div class="col-3">
				<label for="empInfo">university</label> <input name="educationInfoBean[0].university"
					type="text" class="form-control" placeholder="university">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">yop</label> <input name="educationInfoBean[0].yop"
					type="date" class="form-control" placeholder="passout year">
			</div>
			<div class="col-3">
				<label for="empInfo">percentage</label> <input name="educationInfoBean[0].percentage"
					type="number" class="form-control" placeholder="percentage">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">location</label> <input name="educationInfoBean[0].location"
					type="text" class="form-control" placeholder="location">
			</div>
			
		</div>
		
		
        <br><br><br><br>
        <p class="h4" style="margin-left: 20%">Employee Experience Information</p>
        <br>
		<div class="row">
			<div class="col-1"></div>
			
			<div class="col-3">
				<label for="empInfo">Company</label> <input name="experienceInfoBean[0].companyName"
					type="text" class="form-control" placeholder="Company">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">designation</label> <input name="experienceInfoBean[0].designation"
					type="text" class="form-control" placeholder="designation">
			</div>
			<div class="col-3">
				<label for="empInfo">joiningDate</label> <input name="experienceInfoBean[0].joiningDate"
					type="date" class="form-control" placeholder="joiningDate">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">leavingDate</label> <input name="experienceInfoBean[0].leavingDate"
					type="date" class="form-control" placeholder="leavingDate">
			</div>
			
		</div>
		
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<br>
				<button type="submit" name="sbmt" class="form-control">Submit</button>

			</div>
			<div class="col-3">
				<br>
				<button type="reset" class="form-control">Reset</button>
			</div>
		</div>

	</form>
</body>
</html>