package com.covalense.myjavaappnew;

import com.covalense.filecreatinutilnew.bean.EmployeeInfoBean;
import com.covalense.filecreatinutilnew.util.CreateFileUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CreateFileUnit fileUnit= new CreateFileUnit();
    	fileUnit.createFile("mytextfile22", "my name is sourabh");
    	EmployeeInfoBean bean = new EmployeeInfoBean();
    	bean.toString();
    	
    }
}
