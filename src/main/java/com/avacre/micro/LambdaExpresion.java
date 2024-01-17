package com.avacre.micro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



public class LambdaExpresion {
	
	public static List<Student> lst = new ArrayList<Student>();
	static {
		lst.add(new Student("Hernan", 44, 1));
		lst.add(new Student("Diana", 33, 2));
		lst.add(new Student("Alanis", 6, 3));
		lst.add(new Student("Elian", 1, 3));
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		List<Student> names = lst.stream().filter((a) -> a.name.equals("Alanis")).collect(Collectors.toList());
		names.forEach((a) -> System.out.println(a.name));
		
		 Student student = names.stream()
				.filter(a -> a.name.equals("Alanis"))
				//.distinct()
				.findAny()
				.get();
		 
		 	 
	
		
		System.out.println("Lambda expresin manager..."+student.name);

	}
}
