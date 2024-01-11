package collectionDemo;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	int i;
	for(i=10;i>0;i--)
	{
		pq.add(new Integer(i));
		System.out.println(i);
	}
	for(i=1;i<=10;i++)
	{
		Integer c=pq.poll();
		System.out.println(c);
	}

	}

}
