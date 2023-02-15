package LockedMe;

import java.io.File;
import java.util.*;
import LockedMe.lpOperation;

public class ShowFile {
	
	
	public static Set<String> getFiles(){
		File[] files = new File("E:\\Files\\").listFiles();
		
		Set<String> sorted = new TreeSet<>();
		
		for(File file: files) {
			sorted.add(file.getName());
		}
		return(sorted);
		
	}
	
	public static void ShowFiles() {
		
		System.out.println("Show Files In Ascending order");
		System.out.println("-------------------------------");
		getFiles().forEach(System.out::println);
		System.out.println("-------------------");
	}
}
