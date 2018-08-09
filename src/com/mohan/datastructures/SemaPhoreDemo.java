package com.mohan.datastructures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaPhoreDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i = 0; i < 100; i++) {
			executorService.submit(new Runnable() {

				@Override
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		executorService.shutdown();
		try {
			executorService.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Connection {

	private int connections = 0;

	private static Connection instance = new Connection();

	private Semaphore semaphore = new Semaphore(10, true);

	public Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			doConnect();
		} catch (Exception e) {
			semaphore.release();
		}
	}

	public void doConnect() {
		synchronized (this) {
			connections++;
			System.out.println("Connection ---- " + connections);
		}

		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		synchronized (this) {
			connections--;
		}

	}
}