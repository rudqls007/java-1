package kr.co.ezenac.array05;

import java.util.ArrayList;

import kr.co.ezenac.array02.Book;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<Book> libray = new ArrayList<>();
		
		libray.add(new Book("ȥ�� �����ϴ� ��ǻ�� ���� + �ü�� ","���ö"));
		libray.add(new Book("ȥ��2","���ö2"));
		libray.add(new Book("ȥ��3","���ö3"));
		libray.add(new Book("ȥ��4","���ö4"));
		libray.add(new Book("ȥ��5","���ö5"));
		
		for(int i = 0; i<libray.size(); i++) {
			
			libray.get(i).showInfo();
		}
	}	
	
}