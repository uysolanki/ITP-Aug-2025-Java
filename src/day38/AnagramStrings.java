package day38;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		String s1="silent";
		String s2="pisten";
		
		char arr1[]=s1.toCharArray();	//['s','i','l','e','n','t']
		char arr2[]=s2.toCharArray();	//['l','i','s','t','e','n']
		
		Arrays.sort(arr1);   //['e','i','l','n','s','t']
		Arrays.sort(arr2);   //['e','i','l','n','s','t']
		
		String s11=new String(arr1); //"eilnst";
		String s22=new String(arr2); //"eilnst";
		
		if(s11.equals(s22))
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");

	}

}
