package com.mohan.datastructures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadDemo {

	public static void main(String[] args) {
		int CountProcess = Runtime.getRuntime().availableProcessors();
		System.err.println(CountProcess);
		ExecutorService executorService = Executors.newFixedThreadPool(CountProcess);

		for (int i = 0; i < 10; i++) {
			executorService.execute(new Task());
		}
	}

}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Name-----is-- " + Thread.currentThread().getName());
	}
}

