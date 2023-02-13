package LockedMe;

import java.io.File;
import java.util.Scanner;

public class Operations {
	
	Scanner sc = new Scanner(System.in);
	
	public void add() 
	{
		System.out.println("Enter File Name to Add");
		String fnme = sc.nextLine();
		
		File adf = new File(fnme);
			
			if(adf.exists())
			{
				System.out.println("File Already Exits");
			}
			
			else
			{
				adf.createNewFile();
				System.out.println( fnme + "File Created");
			}
		
		
		
	}

}
