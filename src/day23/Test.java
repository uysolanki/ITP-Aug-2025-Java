package day23;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String words[][]={
				{"Full Lang","Stack","Developer"},
				{"java","ReactJS","Lang"},
				{"SQL","Html","Aptitude","Java","is","my","fav","lang"},
				{"lang","is","java","lang"}
				};
		
		String words1[]={"Full lang Stack Developer","java ReactJS language","SQL Html Aptitude java is my fav Lang","lang is java lang"};
			
		String searchWord="lang".toLowerCase();
		
		int counter=0;  //1 2
		for(String arr:words1)
		{
			int startingIndex=0;
			int index;
			do
			{
				
				index=arr.toLowerCase().indexOf(searchWord,startingIndex);
				if(index!=-1)
				{
				counter++;
				startingIndex=index+searchWord.length();
				}
			}while(index!=-1);
			
		}
		
		System.out.println(counter);
	}
}

