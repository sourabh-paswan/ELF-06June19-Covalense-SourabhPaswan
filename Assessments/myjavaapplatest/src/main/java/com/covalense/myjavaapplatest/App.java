package com.covalense.myjavaapplatest;


import com.covalense.filecreatinutilnew.bean.EmployeeInfoBean;
import com.covalense.filecreatinutilnew.util.CreateFileUnit;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {

    CreateFileUnit fileUnit = new CreateFileUnit();
    fileUnit.createFile("Mynewfile.txt", "Hello");
    EmployeeInfoBean bean = new EmployeeInfoBean();
    bean.toString();
   
    }
}
