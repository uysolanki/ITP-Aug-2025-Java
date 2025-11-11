package day36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>();	//min heap	smallest number has highest priority
		pqueue.addAll(Arrays.asList(10,5,1,9,7));
		System.out.println(pqueue);//[10,5,1,9,7]
		System.out.println(pqueue.remove());	
		
		System.out.println(pqueue);//[5,10,9,7]
		
		System.out.println(pqueue.remove());	
		
		System.out.println(pqueue);//[5,10,9,7]

	}

}
