package com.filehandling.practice;

import java.io.File;
import java.io.IOException;

public class DemoCreateFile {
	public static void main(String[] args) throws IOException {
		// create new file
		File f = new File("D:\\DemoFiles\\abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		// create new folder
		File f1 = new File("D:\\DemoFiles\\MyFolderByJava");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		// get fully qualified path of file
		System.out.println(f.getAbsolutePath());
		
		// delete a file
		if(f.exists()) {
			f.delete();
			System.out.println("File deleted successfully");
		} else {
			System.out.println("File doesn't exist");
		}
	}
}
