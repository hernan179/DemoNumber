package com.avacre.micro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.stream.Collectors;



public class LambdaExpresion {
	
	public static List<Student> lst = new ArrayList<Student>();
	static {
		lst.add(new Student("one", 1, 1));
		lst.add(new Student("two", 1, 1));
		lst.add(new Student("three", 2, 2));
		lst.add(new Student("four", 1, 2));
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		List<Student> names = lst.stream().filter((a) -> a.name.equals("one")).collect(Collectors.toList());
		names.forEach((a) -> System.out.println(a.name));
		
		 Student student = names.stream()
				.filter(a -> a.name.equals("one"))
				//.distinct()
				.findAny()
				.get();
		 
		/* List<Student> employeeList =  { 
			 [one, dep1, location1] , 
			 [two, dep1, locations1},
			 [three, dep2, location2],
			 [four, dep1, location2]}*/
	
	//	 Map<Integer, List<Student>> map =  lst.stream().collect(Collectors.groupingBy(Student::getAge));
	
	
		
		System.out.println("Lambda expresin manager..."+lst.stream().collect(Collectors.groupingBy(Student::getDeparmentId)));

	}
}
