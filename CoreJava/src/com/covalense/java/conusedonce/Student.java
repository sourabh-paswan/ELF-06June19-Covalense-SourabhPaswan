package com.covalense.java.conusedonce;

public class Student {
int rollno;
String name;
double percentage;

Student(int x, String y, double z)

{
rollno=x;
name=y;
percentage=z;
}

void Display()
{
	System.out.println("rollno is "+rollno);
	System.out.println("name is "+name);
	System.out.println("percentage is "+percentage);
}

}
