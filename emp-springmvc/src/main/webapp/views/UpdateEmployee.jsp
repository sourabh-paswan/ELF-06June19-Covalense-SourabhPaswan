<!DOCTYPE html>
<%@page import="com.covalense.emp.dto.ExperienceInfoBean"%>
<%@page import="com.covalense.emp.dto.EmployeeEducationInfoBean"%>
<%@page import="com.covalense.emp.dto.EmployeeAddressInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
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
<%
 EmployeeInfoBean infoBean = (EmployeeInfoBean)session.getAttribute("bean");
%>
<body style="background: lightsteelblue">
	<!-- <script src="form.js"></script> -->
	<p class="h3" style="margin-left: 20%">Basic Employee Information</p>
	<hr>
	<form action="../login/updateEmployee" method="post">
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Id</label> <input name="id"
					type="number" class="form-control" value="<%=infoBean.getId()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Joining Date</label> <input name="date"
					type="date" class="form-control"
					value="<%=infoBean.getJoiningDate()%>">
			</div>
		</div>

		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Full Name</label> <input name="name"
					type="text" class="form-control" value="<%=infoBean.getName()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Email Id</label> <input type="text"
					name="email" class="form-control" value="<%=infoBean.getEmail()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Age</label> <input type="number" name="age"
					class="form-control" value="<%=infoBean.getAge()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Designation</label> <input name="designation"
					type="text" class="form-control"
					value="<%=infoBean.getDesignation()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="inputGender">Gender</label> <select id="inputGender"
					name="gender" class="form-control">
					<%if(infoBean.getGender().equals("male")){%>
					<option value="Male" selected="selected">Male</option>
					<option value="Female">Female</option>
					<%}else{%>
					<option value="Male">Male</option>
					<option value="Female" selected="selected">Female</option>
					<%} %>
				</select>
			</div>
			<div class="col-3">
				<label for="empInfo">Date of Birth</label> <input name="dob"
					type="date" class="form-control" value="<%=infoBean.getDob()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Annual Salary</label> <input name="salary"
					type="number" class="form-control"
					value="<%=infoBean.getSalary()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Department Id</label> <input name="deptid"
					type="number" class="form-control"
					value="<%=infoBean.getDepartmentInfoBean().getDeptId()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Contact Number</label> <input name="phone"
					type="number" class="form-control" value="<%=infoBean.getPhone()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Manager Id</label> <input name="managerId"
					type="number" class="form-control"
					value="<%=infoBean.getManagerId()
					%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Bank Account Number</label> <input
					name="account" type="number" class="form-control"
					value="<%=infoBean.getAccountNo()%>">
			</div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<p class="h4" style="margin-left: 20%">Employee Other Information</p>
		<br>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Pan</label> <input
					name="employeeOtherInfoBean.pan" type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getPan()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Is married</label> <input
					name="employeeOtherInfoBean.ismarried" type="text"
					class="form-control"> <select id="inputGender"
					name="gender" class="form-control">
					<%if(infoBean.getEmployeeOtherInfoBean().isMarried()==true){%>
					<option value="true" selected="selected">yes</option>
					<option value="false">no</option>
				</select>
				<%}else{%>
				<option value="true">yes</option>
				<option value="false" selected="selected">no</option>
				</select>
				<%}%>
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Blood group</label> <input
					name="employeeOtherInfoBean.blood" type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getBloodGrp()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Is challanged</label> <input
					name="employeeOtherInfoBean.ischallanged" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().isChallanged()%>">
				<select id="inputGender" name="gender" class="form-control">
					<%if(infoBean.getEmployeeOtherInfoBean().isChallanged()==true){%>
					<option value="true" selected="selected">yes</option>
					<option value="false">no</option>
				</select>
				<%}else{%>
				<option value="true" selected="selected">yes</option>
				<option value="false">no</option>
				</select>
				<%}%>

			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Emergency Number</label> <input
					name="employeeOtherInfoBean.emergencynum" type="number"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyNo()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Emergency contact name</label> <input
					name="employeeOtherInfoBean.emergencycontact" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyName()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Nationality</label> <input
					name="employeeOtherInfoBean.nationality" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getNationality()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Religion</label> <input
					name="employeeOtherInfoBean.religion" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getReligion()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Father name</label> <input
					name="employeeOtherInfoBean.fatherName" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getFatherName()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Mother name</label> <input
					name="employeeOtherInfoBean.mother" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getMotherName()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Spouse</label> <input
					name="employeeOtherInfoBean.spouse" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getSpouse()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">Passport</label> <input
					name="employeeOtherInfoBean.passport" type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getPassport()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Aadhar</label> <input name="eAadhar"
					type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getAadhar()%>">
			</div>

		</div>


		<br>
		<br>
		<br>
		<br>

		<% 
        List<EmployeeAddressInfoBean> addressInfoBeans = infoBean.getAddressInfoBean();
						int i = 0;
						for(EmployeeAddressInfoBean addressInfoBean : addressInfoBeans){
        %>
		<p class="h4" style="margin-left: 20%">Employee Address
			Information</p>
		<br>
		<div class="row">
			<div class="col-1"></div>

			<div class="col-3">
				<label for="empInfo">addressType</label> <select id="addressType"
					name= "addressInfoBean[ <%=i%>
		].addressPkBean.addressType" class="form-control">
					<option>temp</option>
					<option>permanent</option>
				</select>

			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">addressOne</label> <input
					name="addressInfoBean[<%=i%>].addressOne" type="text"
					class="form-control" value="<%=addressInfoBean.getAddressOne()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">addressTwo</label> <input
					name="addressInfoBean[<%=i%>].addressTwo" type="text"
					class="form-control" value="<%=addressInfoBean.getAddressTwo()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">landmark</label> <input
					name="addressInfoBean[<%=i%>].landmark" type="text"
					class="form-control" value="<%=addressInfoBean.getLandmark()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">city</label> <input
					name="addressInfoBean[<%=i%>].city" type="text"
					class="form-control" value="<%addressInfoBean.getCity();%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">state</label> <input
					name="addressInfoBean[<%=i%>].state" type="text"
					class="form-control" value="<%=addressInfoBean.getState()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">country</label> <input
					name="addressInfoBean[<%=i%>].country" type="text"
					class="form-control" value="<%=addressInfoBean.getCountry()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">pincode</label> <input
					name="addressInfoBean[<%=i%>].pincode" type="number"
					class="form-control" value="<%=addressInfoBean.getPincode()%>">
			</div>

		</div>


		<%
		i++;
		} %>

		<br>
		<br>
		<br>
		<br>

		<% 
        List<EmployeeEducationInfoBean> educationInfoBeans = infoBean.getEducationInfoBean();
						int j = 0;
						for(EmployeeEducationInfoBean educationInfoBean : educationInfoBeans){%>
						
		<p class="h4" style="margin-left: 20%">Employee Education
			Information</p>
		<br>
		<div class="row">
			<div class="col-1"></div>

			<div class="col-3">
				<label for="empInfo">educationType</label> <input
					name="educationInfoBean[<%=j%>].educationPkBean.educationType"
					type="text" class="form-control" value="<%=educationInfoBean.getEducationPkBean().getEducationType()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">degreeType</label> <input
					name="educationInfoBean[<%=j%>].degreeType" type="text"
					class="form-control" value="<%=educationInfoBean.getDegreeType()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">branch</label> <input
					name="educationInfoBean[<%=j%>].branch" type="text" class="form-control"
					value="<%=educationInfoBean.getBranch()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">collegename</label> <input
					name="educationInfoBean[<%=j%>].collegename" type="text"
					class="form-control" value="<%=educationInfoBean.getCollegename()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">university</label> <input
					name="educationInfoBean[<%=j%>].university" type="text"
					class="form-control" value="<%=educationInfoBean.getUniversity()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">yop</label> <input
					name="educationInfoBean[<%=j%>].yop" type="date" class="form-control"
					value="<%=educationInfoBean.getYop()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">percentage</label> <input
					name="educationInfoBean[<%=j%>].percentage" type="number"
					class="form-control" value="<%=educationInfoBean.getPercentage()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">location</label> <input
					name="educationInfoBean[<%=j%>].location" type="text"
					class="form-control" value="<%=educationInfoBean.getLocation()%>">
			</div>

		</div>
<%} %>

		<br>
		<br>
		<br>
		<br>
		
		
		<%
		List<ExperienceInfoBean> experienceInfoBeans = infoBean.getExperienceInfoBeans();
		int k = 0;
		for(ExperienceInfoBean experienceInfoBean : experienceInfoBeans){
		%>
		
		<p class="h4" style="margin-left: 20%">Employee Experience
			Information</p>
		<br>
		<div class="row">
			<div class="col-1"></div>

			<div class="col-3">
				<label for="empInfo">Company</label> <input
					name="experienceInfoBean[<%=k%>].companyName" type="text"
					class="form-control" value="<%=experienceInfoBean.getExperiencePKBean().getCompanyName()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">designation</label> <input
					name="experienceInfoBean[<%=k%>].designation" type="text"
					class="form-control" value="<%=experienceInfoBean.getDesignation()%>">
			</div>
			<div class="col-3">
				<label for="empInfo">joiningDate</label> <input
					name="experienceInfoBean[<%=k%>].joiningDate" type="date"
					class="form-control" value="<%=experienceInfoBean.getJoiningDate()%>">
			</div>
		</div>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">leavingDate</label> <input
					name="experienceInfoBean[<%=k%>].leavingDate" type="date"
					class="form-control" value="<%=experienceInfoBean.getLeavingDate()%>">
			</div>

		</div>
		<%
		k++;
		} %>

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