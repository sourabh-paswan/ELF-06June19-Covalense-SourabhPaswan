package com.covalense.java.beanclass;

public class Test {
	public static void main(String[] args) {
		Person p= new Person();
		DB1 d= new DB1();
		DB2 d2=new DB2();
		p.setAge(23);
		p.setName("mee");
		d.recieve(p);
		//System.out.println(p.getName());
		d2.recieve(p);
	}

}
