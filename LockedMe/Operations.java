package LockedMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operations {
	
	Scanner sc = new Scanner(System.in);
	
	public void add()throws Exception {
		System.out.println("Enter File Name to Add");
		String fnme = sc.nextLine();
		
		File adf = new File(fnme);
			
			if(adf.exists()) {
				System.out.println("File Already Exits");
			}
			
			else {
				adf.createNewFile();
				System.out.println( fnme + "File Created");
			}
	}
	public void deletefile() {
		System.out.println("Enter File Name to Delete");
		String fnme = sc.nextLine();
		File def = new File(fnme);
			
			if(def.delete())
				System.out.println("File has Deleted");
			else
				System.out.println("File Not Fount");	
	}
	
	public void searchf() {
		try {
		File dty = new File("C:\\Users\\Darsh\\Project\\src\\Content Files");
		System.out.println("Enter File Name to Search");
		String fnme = sc.nextLine();
		
		File[] files = dty.listFiles();
		int count = 0;
		for(File fo : files) {
			String nme = fo.getName();
			if(nme.equals(fnme)) {
				
				File fd = new File(fnme);
				Scanner scan = new Scanner(fd);
				while(scan.hasNextLine()) {
					System.out.println(scan.nextLine());
				}
				count=1;
				}
			}		
		if(count==0) {
			System.out.println("File Not Found");
		}
		}catch(FileNotFoundException ex) {
			System.out.println("File Not Found");
		}
	
	}

}
