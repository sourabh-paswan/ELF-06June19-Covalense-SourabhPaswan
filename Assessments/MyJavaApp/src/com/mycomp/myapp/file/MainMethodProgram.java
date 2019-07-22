package com.mycomp.myapp.file;

import com.covalense.filecreationutil.util.CreateFileUnit;

public class MainMethodProgram {

	public static void main(String[] args) {
		CreateFileUnit util = new CreateFileUnit();
		util.createFile("myAnotherFile.txt", "sample data");
	}

}
