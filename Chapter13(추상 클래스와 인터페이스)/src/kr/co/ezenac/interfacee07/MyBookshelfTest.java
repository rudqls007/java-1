package kr.co.ezenac.interfacee07;

public class MyBookshelfTest {
	public static void main(String[] args) {
		Queue bqueue = new MyBookshelf();
		bqueue.enQueue("배포 자동화와 지속적 인도1");
		bqueue.enQueue("배포 자동화와 지속적 인도2");
		bqueue.enQueue("배포 자동화와 지속적 인도3");
		
		System.out.println(bqueue.deQueue());
		System.out.println(bqueue.deQueue());
		System.out.println(bqueue.deQueue());
	}
	
	
	
	
}
