/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.*;
public class CopyContentsOfFile {
   
public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("abc.txt");
		FileOutputStream fout=new FileOutputStream("xyz.txt");
		int ch;
		while((ch=fin.read())!=-1)
		{
			fout.write(ch);
		}
		System.out.println("Contents of file copied successfully!!!");
		fin.close();
		fout.close();
	}
}

