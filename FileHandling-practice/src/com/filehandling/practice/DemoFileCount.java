package com.filehandling.practice;

import java.io.File;
import java.io.IOException;

public class DemoFileCount {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\DemoFiles\\cda.txt");
		f.createNewFile();
		File f1 = new File("D:\\DemoFiles\\");
		String [] list = f1.list();
		int dirCount = 0;
		int fileCount = 0;
		
		for(String s : list)
		{
			System.out.println(s);
			File f2 = new File(f1, s);	// search string s in f1 file object
			if(f2.isDirectory())
			{
				dirCount++;
			}
			if(f2.isFile())
			{
				fileCount++;
			}
		}
		System.out.println("Total items: " + list.length);
		System.out.println("Total folders: " + dirCount);
		System.out.println("Total files: " + fileCount);
	}
}
