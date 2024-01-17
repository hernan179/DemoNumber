package com.avacre.micro;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student> students = LambdaExpresion.lst;
       // System.out.println(students.get(0).name);
        
       List<Student> _students =  students.stream().filter(student -> student.age > 2 && student.age < 35)
    		   .collect(Collectors.toList());
        
     //  _students.forEach(a -> System.out.println(a.name));
       System.out.println(_students);
       
       Student fistNonRepeatElement = students.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
       .entrySet()
       .stream()
       .filter(x -> x.getValue() == 1)
       .findFirst().get().getKey();
       
       System.out.println(fistNonRepeatElement);
    		   
       
        
        
	}
}
