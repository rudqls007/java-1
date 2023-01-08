package kr.co.ezenac.threade01;

class MyThread extends Thread {
	@Override
	public void run() {

		

		System.out.println(Thread.currentThread() + "Start");

		int i;
		for (i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
			System.out.println(Thread.currentThread() + "end");
	}
		
}

public class ThreadTest {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread() + " start");
		MyThread thread1 = new MyThread();
		thread1.start();

		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println(Thread.currentThread() + " end");
	}
}


