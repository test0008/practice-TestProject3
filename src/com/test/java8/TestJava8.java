package com.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestJava8 {

	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(4,8,6,7,3);
		
		System.out.println("Find Minmum number : " + list.stream().sorted().findFirst().get()); // 3
		System.out.println("Find Maximum number : " + list.stream().sorted(Comparator.reverseOrder()).findFirst().get()); //8

		
		String s = "121";
		
		
	}

}
