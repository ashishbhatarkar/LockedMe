package LockedMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operations {
	
	Scanner sc = new Scanner(System.in);
	
	public void add()throws Exception {
		System.out.println("Enter File Name to Add");
		String fnme = sc.nextLine();
		
		File adf = new File("E:\\Files\\" + fnme);
			
			if(adf.exists()) {
				System.out.println("File Already Exits");
			}
			
			else {
				adf.createNewFile();
				System.out.println( fnme + " File Created");
			}
	}
	public void deletefile() {
		System.out.println("Enter File Name to Delete");
		String fnme = sc.nextLine();
		File def = new File("E:\\Files\\" + fnme);
			
			if(def.delete())
				System.out.println(fnme + " File has Deleted");
			else
				System.out.println("File Not Fount");	
	}
	
	public void searchf() {
	
		
		File dty = new File("E:\\Files\\");
		System.out.println("Enter File Name to Search");
		String fnme = sc.nextLine();
		
		String[] list = dty.list();
		for(String fo : list) {
			
			if(fnme.equals(fo)) {
				System.out.println("File Found : " + fnme);	
				return;
			}
		}	
		System.out.println("File Not Found");
		
	}
	

}
