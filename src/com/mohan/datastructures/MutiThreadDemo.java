/**
 * 
 */
package com.mohan.datastructures;

public class MutiThreadDemo {

	/**
	 * @param args
	 */
	private static boolean isCancelled_ = false;

	public static void main(String[] args) {
		int n = 10;

	}

	private static void doStuff(int n) {
		try {
			for (int i = 0; i < n; i++) {
				MutltiThread mutltiThread = new MutltiThread();
				mutltiThread.start();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void isCanceled() {
		isCancelled_ = true;
	}

}

class MutltiThread extends Thread {

	@Override
	public void run() {
		System.err.println("----" + Thread.activeCount());
		System.out.println("Thread is --- " + Thread.currentThread().getId() + "---Name is----"
				+ Thread.currentThread().getName());
		MutiThreadDemo.isCanceled();
	}
}
