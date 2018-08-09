package com.mohan.datastructures;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(100);

		try {
			Thread thread = new Thread(new Producer(blockingQueue));
			thread.start();
			Thread thread2 = new Thread(new Consumer(blockingQueue));
			thread2.start();
		} catch (Exception e) {
		}

	}

}

class Producer implements Runnable {

	private BlockingQueue<String> mBlockingQueue;

	public Producer(BlockingQueue<String> blockingQueue) {
		mBlockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				mBlockingQueue.put("Task into queue " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

class Consumer implements Runnable {

	private BlockingQueue<String> mBlockingQueue;

	public Consumer(BlockingQueue<String> blockingQueue) {
		mBlockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.err.println("Task taking from Queue - " + mBlockingQueue.take());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
