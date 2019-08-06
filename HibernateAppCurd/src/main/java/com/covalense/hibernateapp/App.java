package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressPkBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationPkBean;
import com.covalense.hibernateapp.manytoone.ExperienceInfoBean;
import com.covalense.hibernateapp.manytoone.ExperiencePKBean;
import com.covalense.hibernateapp.model.HiberImpl;
import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class App {

	public static void main(String[] args) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(91225);
		bean.setName("sourabh");
		bean.setAge(25);
		bean.setGender("male");
		bean.setSalary(15000);
		bean.setPhone(981083690);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date;
		Date dob;
		try {
			date = format.parse("2017-12-13");
			dob = format.parse("1994-05-04");
			bean.setJoiningDate(date);
			bean.setDob(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setAccountNo(789789979);
		bean.setEmail("yfyfjyf@hkjj.com");
		bean.setDesignation("soft engg");

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setInfoBean(bean);
		otherInfoBean.setPan("1234hhg");
		otherInfoBean.setMarried(true);
		otherInfoBean.setBloodGrp("o+");
		otherInfoBean.setChallanged(false);
		otherInfoBean.setEmergencyNo(4545);
		otherInfoBean.setEmergencyName("rahul");
		otherInfoBean.setNationality("indian");
		otherInfoBean.setReligion("hindu");
		otherInfoBean.setFatherName("pankaj");
		otherInfoBean.setMotherName("reema");
		otherInfoBean.setSpouse("tamya");
		otherInfoBean.setPassport("iihi8998");
		otherInfoBean.setAadhar(878778787);

		bean.setEmployeeOtherInfoBean(otherInfoBean);

		EmployeeAddressPkBean addressPkBean1 = new EmployeeAddressPkBean();
		addressPkBean1.setAddressType("p");
		addressPkBean1.setInfoBean(bean);

		EmployeeAddressPkBean addressPkBean2 = new EmployeeAddressPkBean();
		addressPkBean2.setAddressType("t");
		addressPkBean2.setInfoBean(bean);

		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPkBean(addressPkBean1);
		addressInfoBean1.setAddressOne("here");
		addressInfoBean1.setAddressTwo("there");

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPkBean(addressPkBean2);
		addressInfoBean2.setAddressOne("hereqq");
		addressInfoBean2.setAddressTwo("thereqq");

		bean.setAddressInfoBean(Arrays.asList(addressInfoBean1, addressInfoBean2));

		// =======================================================================================================================

		EmployeeEducationPkBean educationPkBean1 = new EmployeeEducationPkBean();
		educationPkBean1.setEducationType("reg");
		educationPkBean1.setInfoBean(bean);

		EmployeeEducationPkBean educationPkBean2 = new EmployeeEducationPkBean();
		educationPkBean2.setEducationType("dist");
		educationPkBean2.setInfoBean(bean);

		EmployeeEducationInfoBean educationInfoBean1 = new EmployeeEducationInfoBean();
		educationInfoBean1.setEducationPkBean(educationPkBean1);
		educationInfoBean1.setDegreeType("tech");

		EmployeeEducationInfoBean educationInfoBean2 = new EmployeeEducationInfoBean();
		educationInfoBean2.setEducationPkBean(educationPkBean2);
		educationInfoBean2.setDegreeType("med");

		bean.setEducationInfoBean(Arrays.asList(educationInfoBean1, educationInfoBean2));

		HiberImpl impl = new HiberImpl();
		impl.createEmployee(bean);

		/*
		 * public static void main(String[] args) { TrainingInfoBean trainingInfoBean =
		 * new TrainingInfoBean(); trainingInfoBean.setCourseId(545);
		 * trainingInfoBean.setCollegeName("ppopo");
		 * 
		 * HiberImpl hiberImpl = new HiberImpl(); EmployeeInfoBean employeeInfoBean1 =
		 * hiberImpl.getEmployeeInfoBean(2); // EmployeeInfoBean employeeInfoBean2 =
		 * hiberImpl.getEmployeeInfoBean(3);
		 * 
		 * EmployeeInfoBean employeeInfoBean2 = new EmployeeInfoBean();
		 * employeeInfoBean2.setId(741); employeeInfoBean2.setName("tyty");
		 * 
		 * trainingInfoBean.setInfoBeans(Arrays.asList(employeeInfoBean1,
		 * employeeInfoBean2));
		 * 
		 * hiberImpl.createTraining(trainingInfoBean); }
		 */

		/*
		 * public static void main(String[] args) { EmployeeInfoBean bean = new
		 * EmployeeInfoBean(); bean.setId(1011); bean.setName("hatu");
		 * bean.setDesignation("MD");
		 * 
		 * EmployeeInfoBean bean2 = new EmployeeInfoBean(); bean2.setId(45);
		 * bean2.setName("hnn"); bean2.setManagerId(bean);
		 * 
		 * 
		 * EmployeeInfoBean bean3 = new EmployeeInfoBean(); bean3.setId(489);
		 * bean3.setName("piii"); bean3.setManagerId(bean);
		 * 
		 * 
		 * 
		 * HiberImpl impl = new HiberImpl(); impl.createEmployee(bean2);
		 * impl.createEmployee(bean3);
		 * 
		 * 
		 * }
		 */

		/*
		 * public static void main(String[] args) { EmployeeInfoBean bean = new
		 * EmployeeInfoBean(); bean.setId(89844); bean.setName("sourabh");
		 * bean.setAge(25); bean.setGender("male"); bean.setSalary(15000);
		 * bean.setPhone(981083690); SimpleDateFormat format = new
		 * SimpleDateFormat("yyyy-mm-dd"); Date date; Date dob; try { date =
		 * format.parse("2017-12-13"); dob = format.parse("1994-05-04");
		 * bean.setJoiningDate(date); bean.setDob(dob); } catch (ParseException e) {
		 * e.printStackTrace(); } bean.setAccountNo(789789979);
		 * bean.setEmail("yfyfjyf@hkjj.com"); bean.setDesignation("soft engg");
		 * bean.setDepartmentId(455); bean.setPassword(1234);
		 * 
		 * EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		 * otherInfoBean.setInfoBean(bean); otherInfoBean.setPan("1234hhg");
		 * otherInfoBean.setMarried(true); otherInfoBean.setBloodGrp("o+");
		 * otherInfoBean.setChallanged(false); otherInfoBean.setEmergencyNo(4545);
		 * otherInfoBean.setEmergencyName("rahul");
		 * otherInfoBean.setNationality("indian"); otherInfoBean.setReligion("hindu");
		 * otherInfoBean.setFatherName("pankaj"); otherInfoBean.setMotherName("reema");
		 * otherInfoBean.setSpouse("tamya"); otherInfoBean.setPassport("iihi8998");
		 * otherInfoBean.setAadhar(878778787);
		 * 
		 * EmployeeAddressPkBean addressPkBean1 = new EmployeeAddressPkBean();
		 * addressPkBean1.setAddressType("present"); addressPkBean1.setInfoBean(bean);
		 * 
		 * EmployeeAddressPkBean addressPkBean2 = new EmployeeAddressPkBean();
		 * addressPkBean2.setAddressType("temp"); addressPkBean2.setInfoBean(bean);
		 * 
		 * EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		 * addressInfoBean1.setAddressOne("jhaha");
		 * addressInfoBean1.setAddressTwo("phpha");
		 * addressInfoBean1.setCountry("russia");
		 * addressInfoBean1.setAddressPkBean(addressPkBean1);
		 * 
		 * EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		 * addressInfoBean2.setAddressOne("jhaha");
		 * addressInfoBean2.setAddressTwo("phpha");
		 * addressInfoBean2.setCountry("russia");
		 * addressInfoBean2.setAddressPkBean(addressPkBean2);
		 * 
		 * EmployeeEducationPkBean educationPkBean1 = new EmployeeEducationPkBean();
		 * educationPkBean1.setEducationType("regular");
		 * educationPkBean1.setInfoBean(bean);
		 * 
		 * EmployeeEducationPkBean educationPkBean2 = new EmployeeEducationPkBean();
		 * educationPkBean2.setEducationType("distance");
		 * educationPkBean2.setInfoBean(bean);
		 * 
		 * EmployeeEducationInfoBean educationInfoBean1 = new
		 * EmployeeEducationInfoBean(); educationInfoBean1.setDegreeType("tech");
		 * educationInfoBean1.setBranch("it");
		 * educationInfoBean1.setLocation("hagward");
		 * educationInfoBean1.setEducationPkBean(educationPkBean1);
		 * 
		 * EmployeeEducationInfoBean educationInfoBean2 = new
		 * EmployeeEducationInfoBean(); educationInfoBean2.setDegreeType("biotech");
		 * educationInfoBean2.setBranch("med");
		 * educationInfoBean2.setLocation("snapeworld");
		 * educationInfoBean2.setEducationPkBean(educationPkBean2);
		 * 
		 * ExperiencePKBean experiencePKBean1 = new ExperiencePKBean();
		 * experiencePKBean1.setCompanyName("jham");
		 * experiencePKBean1.setInfoBean(bean);
		 * 
		 * ExperiencePKBean experiencePKBean2 = new ExperiencePKBean();
		 * experiencePKBean2.setCompanyName("sham");
		 * experiencePKBean2.setInfoBean(bean);
		 * 
		 * ExperienceInfoBean experienceInfoBean1 = new ExperienceInfoBean();
		 * experienceInfoBean1.setDesignation("md");
		 * experienceInfoBean1.setExperienceInfoBean(experiencePKBean1);
		 * 
		 * ExperienceInfoBean experienceInfoBean2 = new ExperienceInfoBean();
		 * experienceInfoBean2.setDesignation("admin");
		 * experienceInfoBean2.setExperienceInfoBean(experiencePKBean2);
		 * 
		 * EmployeeInfoBean bean2 = new EmployeeInfoBean(); bean2.setName("rami");
		 * bean2.setAge(45);
		 * 
		 * EmployeeInfoBean bean3 = new EmployeeInfoBean(); bean2.setName("syami");
		 * bean2.setAge(45);
		 * 
		 * EmployeeInfoBean bean4 = new EmployeeInfoBean(); bean2.setName("popop");
		 * bean2.setAge(45);
		 * 
		 * TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		 * trainingInfoBean.setCourseId(454); trainingInfoBean.setCollegeName("pojo");
		 * trainingInfoBean.setDuration("456");
		 * 
		 * trainingInfoBean.setInfoBeans(Arrays.asList(bean2, bean3, bean4));
		 * 
		 * 
		 * HiberImpl impl = new HiberImpl();
		 * 
		 * impl.createEmployee(bean, otherInfoBean, Arrays.asList(addressInfoBean1,
		 * addressInfoBean2), Arrays.asList(educationInfoBean1, educationInfoBean2),
		 * Arrays.asList(experienceInfoBean1, experienceInfoBean2));
		 * 
		 * 
		 * //impl.createTraining(trainingInfoBean);
		 * 
		 * }
		 */

	}
}
