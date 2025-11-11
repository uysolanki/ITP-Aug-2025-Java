package day36;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>(Collections.reverseOrder());//max heap	bigest number has highest priority
		pqueue.addAll(Arrays.asList(10,5,1,9,7));
		System.out.println(pqueue);//[9,1,5,7]
		System.out.println(pqueue.remove());	
		
		System.out.println(pqueue);//[7,10,5]
		
		System.out.println(pqueue.remove());	
		
		System.out.println(pqueue);//[5,10,9,7]
	}
}
