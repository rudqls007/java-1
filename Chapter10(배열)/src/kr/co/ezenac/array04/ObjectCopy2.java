package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] libray = new Book[5];
		Book[] copylibray = new Book[5];
		libray[0] = new Book("혼자 공부하는 컴퓨터 구조+ 운영체제", " 김민철");
		libray[1] = new Book("혼자 공부하는 컴퓨터 구조+ 운영체제1", " 김민철1");
		libray[2] = new Book("혼자 공부하는 컴퓨터 구조+ 운영체제2", " 김민철2");
		libray[3] = new Book("혼자 공부하는 컴퓨터 구조+ 운영체제3", " 김민철3");
		libray[4] = new Book("혼자 공부하는 컴퓨터 구조+ 운영체제4", " 김민철4");
		
		copylibray[0] = new Book();
		copylibray[1] = new Book();
		copylibray[2] = new Book();
		copylibray[3] = new Book();
		copylibray[4] = new Book();
		
		for( int i = 0; i<libray.length; i++) {
			copylibray[i].setTitle(libray[i].getTitle());
			copylibray[i].setAuthor(libray[i].getTitle());
		}
		
		System.arraycopy(libray, 0, copylibray, 0, 5);
		
		for(Book book : copylibray)
			book.showInfo();
	
		
		libray[0].setTitle("구글 엔지니어는 이렇게 일한다");
		libray[0].setAuthor("타이티스 윈터스");
		
		System.out.println();
		
		for(Book book : libray)
			book.showInfo();
		
		System.out.println();
		
		for(Book book : copylibray)
			book.showInfo();
	}
}
