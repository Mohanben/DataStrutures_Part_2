package com.mohan.datastructures;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeueDemo {

	public static void main(String[] args) {
		BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(10);
		blockingDeque.addFirst("Task 1");
		blockingDeque.addFirst("Task 2");
		blockingDeque.addLast("Task 5");

		try {
			System.out.println(blockingDeque.takeFirst());
			System.err.println(blockingDeque.takeLast());
		} catch (Exception e) {

		}
	}

}
