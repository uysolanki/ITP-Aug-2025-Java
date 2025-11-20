package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownstreamDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));

		                 
		Map<Integer,List<String>> hashmap1=months.stream().collect(Collectors.groupingBy(month->month.length()));
		System.out.println(hashmap1);
		
		//question
		Map<Integer,String> hashmap2=months.stream().collect(Collectors.groupingBy(month->month.length(),Collectors.joining("-")));
		System.out.println(hashmap2);
		
		//question
		Map<Integer,List<String>> hashmap3=months.stream().collect(Collectors.groupingBy(month->month.length(),Collectors.mapping(s->s.toUpperCase(),Collectors.toList())));
		System.out.println(hashmap3);

	}

}

/*
3  : "June-July"
*/