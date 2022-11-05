package kr.co.ezenac.interfacee07;
//책꽂이

import java.util.ArrayList;

public class BookShelf {

	protected ArrayList<String> bookshelf;
	public BookShelf() {
		bookshelf = new ArrayList<>();
		
	}
	public ArrayList<String> getBookshelf(){
		return bookshelf;
	}
	public int getCount() {
		return bookshelf.size();
	}

}
