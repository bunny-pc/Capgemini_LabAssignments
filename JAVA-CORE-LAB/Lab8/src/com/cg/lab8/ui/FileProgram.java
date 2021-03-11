package com.cg.lab8.ui;

import com.cg.lab8.threads.CopyDataThread;

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread copy=new CopyDataThread("D:/venka/workclass/labBookAssignment/Lab8/source.txt","destination.txt");
		copy.start();
	}

}
