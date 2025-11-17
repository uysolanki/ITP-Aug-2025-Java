package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {
//		List<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5));
		
//		List<Integer> sqrNumbers= numbers.stream().map((num)->num*num).collect(Collectors.toList());
//		System.out.println(sqrNumbers);
		
//		numbers.stream().map((num)->num*num).forEach((num)->System.out.println(num));
//		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
//		
//		
//		List<String> allCaps=months.stream().map(month->month.toUpperCase()).collect(Collectors.toList());
//		System.out.println(allCaps);
//		
//		List<Integer> allLengths=months.stream().map(month->month.length()).collect(Collectors.toList());
//		System.out.println(allLengths);
				
		
//		List<String> capsMonthsGreaterThan5=months.stream().filter(month->month.length()>=5).map(month->month.toUpperCase()).collect(Collectors.toList());
//		System.out.println(capsMonthsGreaterThan5);
		
		
//		List<String> capsMonthsGreaterThan5=months.stream().filter(month->month.length()>=5).map(month->month.toUpperCase()).toList();
//		System.out.println(capsMonthsGreaterThan5);
//				
		
//		List<String> capsMonthsGreaterThan5=months
//				.stream()
//				.filter(month->month.length()>=5)
//				.map(month->month.toUpperCase())
//				.toList();
//		System.out.println(capsMonthsGreaterThan5);
		
		
//		List<String> capsMonthsGreaterThan5abc=months
//				.stream()
//				.filter(StreamAPIDemo::checkLength)
//				.map(StreamAPIDemo::myUpper)
//				.collect(Collectors.toList());
//		
//		System.out.println(capsMonthsGreaterThan5abc);
		
		
//				months
//				.stream()
//				.filter(StreamAPIDemo::checkLength)
//				.map(StreamAPIDemo::myUpper)
//				.forEach(month->System.out.println(month));
//		
		
//		months
//		.stream()
//		.filter(StreamAPIDemo::checkLength)
//		.map(StreamAPIDemo::myUpper)
//		.forEach(StreamAPIDemo::display);
		
		
		months
		.stream()
		.filter(StreamAPIDemo::checkLength)
		.map(StreamAPIDemo::myUpper)
		.forEach(System.out::println);
		
		
		List<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5));
		numbers.stream().forEach(System.out::println);
		int sum=numbers.stream().reduce((num,acc)->num+acc).get();
		System.out.println(sum);
	}
	
	
	
	public static boolean checkLength(String str)
	{
		if(str.length()>=5)
			return true;
		else
			return false;
	}
	
	public static String myUpper(String str)
	{
		return str.toUpperCase();
	}
	
//	public static void display(String str)
//	{
//		System.out.println(str);
//	}

}
