package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student1 {
	private int studentId;
	private String studentName;
	ArrayList<Book> studentlist;
	
	public  Student1(int studentId, String studentName) {
//		super();
		this.studentId = studentId;
		this.studentName = studentName;
		
		studentlist = new ArrayList<>();
	}
	


	public void addBook(String name) {
		Book Book = new Book();
		
		Book.setName(name);
		studentlist.add(Book);
	}
	
	public void showInfo() {
		System.out.print(" 학생" +  this.studentName+ " 가 읽은 책은 : " );	
		for(Book book : studentlist) {
			System.out.print(book.getName() + " ");
			
		}
		System.out.println(" 입니다");
	
	}
	




}
