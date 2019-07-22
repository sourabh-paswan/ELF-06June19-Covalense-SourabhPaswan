package com.covalense.java.javabean;

public class MyArrayClass {
	private Object[] myArray;
	private static int initialSize =10;
	private int index;

	public MyArrayClass() {
		this(initialSize);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than zero !!!!");
		}
		myArray = new Object[size];
		
		index = 0;
	}

	public void add(Object val) {
		if(index > myArray.length) {
			Object[] myArrayNew= new Object[20];
			System.arraycopy(myArray, 0, myArrayNew, 0, myArray.length);
			myArray=myArrayNew;
				
		}
		else {
			
			myArray[index] = val;
			index++;
	}
	}

	public void remove(int position) {
		myArray[position] = null;
		if(position > myArray.length-1) {
			 throw new IndexOutOfBoundsException();
			 
		 }
//		for (int i = position; i < myArray.length - 1; i++) {
//
//			myArray[i] = myArray[i + 1];
		System.arraycopy(myArray, position+1, myArray, position, (myArray.length-1)-position);

		}
	
	public int getsize() {
		return index-1;
		
	}
	 

	public Object get(int position) {
		return myArray[position];
	}

}// End of Class
