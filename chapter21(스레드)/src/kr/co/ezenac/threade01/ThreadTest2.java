package kr.co.ezenac.threade01;

class MyThread2 implements java.lang.Runnable {

	public void run() {

		System.out.println(Thread.currentThread() + "Start");

		int i;
		for (i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
			System.out.println(Thread.currentThread() + "end");

		
	}

}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");
		
		MyThread2 runnable = new MyThread2();
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2 = new Thread(new MyThread2());
		thread2.start();


		Runnable anonymousThread = new Runnable() {
			
			public void run() {
				System.out.println("anonymous running");
			}
		};
		
		anonymousThread.run();
		
		System.out.println(Thread.currentThread() + " end");
		
	}

}
