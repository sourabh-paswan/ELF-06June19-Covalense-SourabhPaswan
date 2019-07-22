//
//package com.covalense.emp.util;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import com.covalense.emp.dto.EmployeeInfoBean;
//import com.covalense.emp.dto.EmployeeOtherInfoBean;
//
//public class PrepareDataUtil {
//
//	private PrepareDataUtil() {
//	}
//
//	public static EmployeeInfoBean prepareData(int id) {
//
//		EmployeeInfoBean empInfo = new EmployeeInfoBean();
//		empInfo.setId(id);
//		empInfo.setName("sourabh");
//		empInfo.setAge(25);
//		empInfo.setGender("male");
//		empInfo.setSalary(15000);
//		empInfo.setPhone(981083690);
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//		Date date;
//		Date dob;
//		try {
//			date = format.parse("2017-12-13");
//			dob = format.parse("1994-05-04");
//			empInfo.setJoiningDate(date);
//			empInfo.setDob(dob);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//
//		empInfo.setAccountNo(789789979);
//		empInfo.setEmail("yfyfjyf@hkjj.com");
//		empInfo.setDesignation("soft engg");
//
//		empInfo.setDepartmentId(455);
//		empInfo.setManagerId(789797);
//
//		EmployeeOtherInfoBean empOther = new EmployeeOtherInfoBean();
//		empOther.setId(id);
//		empOther.setPan("1234hhg");
//		empOther.setMarried(true);
//		empOther.setBloodGrp("o+");
//		empOther.setChallanged(false);
//		empOther.setEmergencyNo(4545);
//		empOther.setEmergencyName("rahul");
//		empOther.setNationality("indian");
//		empOther.setReligion("hindu");
//		empOther.setFatherName("pankaj");
//		empOther.setMotherName("reema");
//		empOther.setSpouse("tamya");
//		empOther.setPassport("iihi8998");
//		empOther.setAadhar(878778787);
//
//		empInfo.setOtherInfo(empOther);
//		return empInfo;
//
//	}
//
//}
