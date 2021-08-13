package com.test1;

import java.util.ArrayList;
import java.util.List;

class ProducerTest implements Runnable{
	
	private List<Integer> sharedList=null;
	private int MAX_CAPACITY=5;
	int item=0;
	public ProducerTest(List<Integer> sharedList) {
		this.sharedList=sharedList;
	}

	@Override
	public void run() {
		while(true) {
			try {
				produceItem(item++);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void produceItem(int item) throws Exception {
		synchronized (sharedList) {
			while(sharedList.size()==MAX_CAPACITY) {
				System.out.println("SharedList is full... waiting for the consumer to consume");
					sharedList.wait();
			}
		}
		synchronized (sharedList) {
			System.out.println("Producer produced item : "+item);
			sharedList.add(item);
			Thread.sleep(1000);
			sharedList.notify();
		}
	}
	
	
	
	
}

class ConsumerTest implements Runnable{
	
	private List<Integer> sharedList=null;
	public ConsumerTest(List<Integer> sharedList) {
		this.sharedList=sharedList;
	}

	@Override
	public void run() {
		while(true) {
			try {
				consumeItem();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void consumeItem() throws Exception {
		synchronized (sharedList) {
			while(sharedList.isEmpty()) {
				System.out.println("SharedList is Full... waiting for the producer to produce the item.");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
				System.out.println("Consuming Item : "+sharedList.remove(0));
				Thread.sleep(1000);
				sharedList.notify();
		}	
	
}
}
public  class Test4 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	Thread t1=new Thread(new ProducerTest(list));
	Thread t2=new Thread(new ConsumerTest(list));
	t1.start();
	t2.start();
}
}
