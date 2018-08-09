package com.mohan.datastructures;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorServiceDemo {

	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors
				.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

		ScheduledFuture<String> future = executorService.schedule(new Callable<String>() {
			@Override
			public String call() throws Exception {

				return "Called!!!";
			}
		}, 10, TimeUnit.SECONDS);

		try {
			System.out.println("---Thread Pool executor ----" + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		executorService.shutdown();
	}

}
