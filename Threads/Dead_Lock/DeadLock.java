package com.deadlock;

import interfaces.MyInterface;

public class DeadLock {

	public static void main(String args[]) {
		Integer lock1 = new Integer(7);
		String lock2 = "lock2";

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("thread1 aquired lock1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					lock1.notify();
					synchronized (lock2) {
						System.out.println("thread1 aquired lock2");
						
						System.out.println("End of synchronized block2");
					}
					System.out.println("End of synchronized block1");
				}
			}
		}, "thread1").start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("thread2 aquired lock2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (lock1) {
						System.out.println("thread2 aquired lock1");
						
						System.out.println("End of synchronized block2");
					}
					
					System.out.println("End of synchronized block1");
				}
			}

		}, "thread2").start();

	}

}
