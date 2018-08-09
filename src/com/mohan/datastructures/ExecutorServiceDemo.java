package com.mohan.datastructures;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		HashSet<Callable<String>> callables = new HashSet<>();

		callables.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Task 1";
			}
		});

		callables.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Task 2";
			}
		});

		callables.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Task 3";
			}
		});

		try {
			List<Future<String>> executorServicesd = executorService.invokeAll(callables);
			for (int i = 0; i < executorServicesd.size(); i++) {
				String string = executorServicesd.get(i).get();
				Thread.sleep(1000);
				System.out.println(string);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		executorService.shutdown();
	}

}
