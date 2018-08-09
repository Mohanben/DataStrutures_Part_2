/**
 * 
 */
package com.mohan.datastructures;

public class ThreadRunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			Thread thread = new Thread(new MutlthreadRunnable());
			thread.start();
		}
	}

}

class MutlthreadRunnable implements Runnable {

	@Override
	public void run() {
		System.err.println("----- ------" + Thread.currentThread().getId());
	}

}
