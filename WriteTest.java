package com.classdemo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteTest {

	public static void main(String[] args) throws IOException {
		
		File  f = new File("input.txt");
		String str="copy this string to file";
		
		FileWriter fw=new FileWriter(f);
		fw.write(str);
        fw.close();
	}

}

