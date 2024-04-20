package com.iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("PDetails.txt");
		ObjectOutputStream os= new ObjectOutputStream(fos);
		Person ps= new Person(8, "mili");
		os.writeObject(ps);
		
		os.close();
		fos.close();
		
		System.out.println("--");
		System.out.println("...");
		
		FileInputStream fis= new FileInputStream("pDetails.txt");
		ObjetInptStream ois= new ObjetInptStream(fis);
		ois.readObject();
				
				
	}

}
