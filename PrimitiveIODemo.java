package com.classdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIODemo {

	public static void main(String[] args) throws IOException {
		
   FileOutputStream fos=new FileOutputStream("primitive.txt");
   DataOutputStream dos=new DataOutputStream(fos);
   dos.writeInt(20);
   dos.writeDouble(3.5);
   dos.writeBoolean(true);
   dos.close();
   fos.close();
   
   System.out.println("file create");
   System.out.println("----");
   System.out.println("file reading");
   
   FileInputStream fis=new  FileInputStream("primitive.txt");
   DataInputStream dis=new DataInputStream(fis);
   
   dis.readBoolean();
   dis.readInt();
   dis.readDouble();
   
   dis.close();
   fis.close();
	}

}
