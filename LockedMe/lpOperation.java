package LockedMe;

import java.util.Scanner;

public class lpOperation {
	
	
	public static void FrontSc() {
		System.out.println("Company Locker Pvt Ltd");
		System.out.println("Devloper Name : ASHISH BHATARKAR");
		System.out.println("-----------------------------");
		System.out.println("------------------------------");
	}
	
	public static void MenuDr()throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Operations ops = new Operations();
		ShowFile Swf = new ShowFile();
		
		int dnum;
		do {
			System.out.println("Choose Perform Action");
			System.out.println("\t1. Retrive File in Ascending order");
			System.out.println("\t2. Business Level Operation");
			System.out.println("\t3. Exit From the Application");
			
			dnum = sc.nextInt();
			switch(dnum) {
				
			case 1: Swf.ShowFiles();
					break;
					
			case 2: 
				int op;
				do {
					System.out.println("Business Level Operations");
					System.out.println("\t1=> Add File");
					System.out.println("\t2=> Delete File");
					System.out.println("\t3=> Search File");
					System.out.println("\t4=> Exit to Main Menu");
					
					op=sc.nextInt();
					switch(op) {
					
					case 1:
							ops.add();
							break;
							
					case 2:
							ops.deletefile();
							break;
							
					case 3:
							ops.searchf();
							break;
							
					case 4:
							System.out.println("Exited From the business Level Opration");
							System.out.println("*****************************************");
							break;
							
					default:
							System.out.println("Invalid Choice");
							break;
					}
				}while(op!=4);
				break;
				
			case 3:
					System.out.println("Exiting From The Application\n*******************************\n****Thanks For Using App****");
					break;
					
			default:
					System.out.println("Invalid Choice");
			
			
			
			}
			
		}while(dnum!=3);
		
	}

}
