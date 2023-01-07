package kr.co.ezenac.threade02;

class PriorityThread2 extends Thread {
	@Override
	public void run() {
		int sum = 0;

		Thread thread = Thread.currentThread();
		System.out.println(thread + "start");
		for (int i = 0; i <= 1000000; i++) {
			sum += i;

		}
		System.out.println(thread.getPriority() + "end");
	}
}

public class PriorityTest2 {

	public static void main(String[] args) {
		int i;
		
		PriorityThread2 pt1  = new PriorityThread2();
		PriorityThread2 pt2  = new PriorityThread2();
		PriorityThread2 pt3  = new PriorityThread2();
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
//		for (i =0; i < 3; i++) {
//			PriorityThread2 priorityThread = new PriorityThread2();
//			if (i == 0) {
//				priorityThread.setPriority(Thread.MIN_PRIORITY);
//			}
//			else if(i == 1) {
//				priorityThread.setPriority(Thread.NORM_PRIORITY);
//			}
//			else if(i == 2) {
//				priorityThread.setPriority(Thread.MAX_PRIORITY);
//			}
//			priorityThread.start();
//		}
	}
}
