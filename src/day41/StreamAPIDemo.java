package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {
	
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));

		Map<Boolean,List<String>> hashmap=months.stream().collect(Collectors.partitioningBy(month->month.length()>=5));
		
		List<String> list=months.stream().collect(Collectors.partitioningBy(month->month.length()>=5)).get(true);
		
		
		System.out.println(list);
		
		Map<Integer,List<String>> hashmap1=months.stream().collect(Collectors.groupingBy(month->month.length()));
		System.out.println(hashmap1);
		
		List<String> words=new ArrayList(Arrays.asList("silent","listen","note","tone","cab","abc","bac","apple"));
		
		Map<String,List<String>> anagramGroups= words.stream().collect(Collectors.groupingBy(word->{
			char arr[]=word.toCharArray();
			Arrays.sort(arr);
			return new String(arr);
		}));
		
		Map<String,List<String>> anagramGroups1= words.stream().collect(Collectors.groupingBy(StreamAPIDemo::generateKey));

		System.out.println(anagramGroups1.values());
	}
	
	public static String generateKey(String str)
	{
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}


/*
eilnst : [silent,listen]
enot : [note,tone]
abc : [cba,cab,bca]
 
 */
