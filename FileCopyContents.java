package com.sheetal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyContents {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file1 = new File("C:\\Users\\Sheetal\\eclipse-workspace\\JavaProgramsAssignment\\resources\\wordcount.txt");
			File file2 = new File("C:\\Users\\Sheetal\\eclipse-workspace\\JavaProgramsAssignment\\resources\\sample.txt");
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			byte[] buffer = new byte[1024];
			int length;

			while ((length = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, length);
			}
			fis.close();
			fos.close();
			System.out.println("File contents copied successfully");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
