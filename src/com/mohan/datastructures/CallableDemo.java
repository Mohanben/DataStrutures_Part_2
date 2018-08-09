package com.mohan.datastructures;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<Integer> future = executorService.submit(new ThreadCallable());

		try {
			System.out.println("Future Task is :" + future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}

class ThreadCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {

		Random random = new Random();
		int duration = random.nextInt(6000);

		try {
			System.out.println("Starting........");
			Thread.sleep(duration);
			System.out.println("Finished........");
		} catch (Exception e) {
			System.err.println("Ecexeption Caught : ----" + e.getMessage());
		}
		return duration;
	}
}
