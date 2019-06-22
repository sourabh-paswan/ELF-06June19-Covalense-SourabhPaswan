package com.covalense.java.sortarray;
import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class TestEmp {
	public static void main(String[] args) {
		 EmpBeanArray[] emp= new EmpBeanArray[4];
		 
		 EmpBeanArray e1= new EmpBeanArray();
		
		 e1.setName("rahul");
		 e1.setAge(24);
		 e1.setSalary(7686868);
		 
		 EmpBeanArray e2= new EmpBeanArray();
			
		 e2.setName("rahul");
		 e2.setAge(24);
		 e2.setSalary(7686868);
		 EmpBeanArray e3= new EmpBeanArray();
			
		 e3.setName("rahul");
		 e3.setAge(24);
		 e3.setSalary(7686868);
		 EmpBeanArray e4= new EmpBeanArray();
			
		 e4.setName("rahul");
		 e4.setAge(24);
		 e4.setSalary(7686868);
		 
		 
		 
		 emp[0]=e1;
		 emp[1]=e2;
		 emp[2]=e3;
		 emp[3]=e4;
		 
		 Arrays.sort(emp);
		 
		 for(EmpBeanArray a: emp)
		 {
			 System.out.println("name is "+a.getName());
			 System.out.println("age is "+a.getAge());
			 System.out.println("salary is "+a.getSalary());
		 }
	}

}
