package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] libray = new Book[5];
		Book[] copylibray = new Book[5];
		libray[0] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��", " ���ö");
		libray[1] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��1", " ���ö1");
		libray[2] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��2", " ���ö2");
		libray[3] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��3", " ���ö3");
		libray[4] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��4", " ���ö4");
		
		System.arraycopy(libray, 0, copylibray, 0, 5);
		
		for(Book book : copylibray)
			book.showInfo();
	
		
		libray[0].setTitle("���� �����Ͼ�� �̷��� ���Ѵ�");
		libray[0].setAuthor("Ÿ��Ƽ�� ���ͽ�");
		
		System.out.println();
		
		for(Book book : libray)
			book.showInfo();
		
		System.out.println();
		
		for(Book book : copylibray)
			book.showInfo();
	}
}
