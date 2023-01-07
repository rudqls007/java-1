package kr.co.ezenac.threade04;

public class SyncIssue {

	   public static int money = 0;

	   // 메소드 동기화 
	//   public synchronized static void deposit() {
//	         money++;
	//   }
	//   public synchronized static void withdarw() {
//	         money--;
	//   }

	   public static void main(String[] args) throws InterruptedException {

	      
	         Runnable task1 = () -> {
	            synchronized (SyncIssue.class) {
	            for (int i = 0; i < 10000; i++)
	               //deposit();
	               money++;
	            }
	         };
	      

	      Runnable task2 = () -> {
	         synchronized (SyncIssue.class) {
	            for (int i = 0; i < 10000; i++)
	               //withdarw();
	               money--;
	         }
	      };

	   
	      Thread thread1 = new Thread(task1);
	      Thread thread2 = new Thread(task2);

	      thread1.start();
	      thread2.start();

	      thread1.join(); // thread1의 종료를 main thread가 기다림
	      thread2.join(); // thread1의 종료를 main thread가 기다림

	      System.out.println(money);

	   }
	}
