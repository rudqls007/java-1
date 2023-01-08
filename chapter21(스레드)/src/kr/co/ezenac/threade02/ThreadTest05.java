package kr.co.ezenac.threade02;


class Thread11 extends Thread {
	int start;
	int end;
	int total;
	public Thread11(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public void run() {
		int i;
		for (i = start; i <= end; i++) {
			total +=i;
		}
	}

}

public class ThreadTest05 {

	public static void main(String[] args) {

			System.out.println(Thread.currentThread() + " start ");
			Thread11 th1 = new Thread11(1, 50);
			Thread11 th2 = new Thread11(51, 100);
			
			th1.start();
			th2.start();
			
			try {
				th1.join();		//main 스레드는 not running 상태로 된다.
				th2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int sum = th1.total + th2.total;
			System.out.println("th1 total =" + th1.total );
			System.out.println("th2 total =" + th2.total );
			System.out.println(" sum =" + sum );
			
			System.out.println(Thread.currentThread() + "end");
			
			
			
			
		}
	}


