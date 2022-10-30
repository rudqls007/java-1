package kr.co.ezenac.array05;

import java.util.ArrayList;

import kr.co.ezenac.array02.Book;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<Book> libray = new ArrayList<>();
		
		libray.add(new Book("È¥ÀÚ °øºÎÇÏ´Â ÄÄÇ»ÅÍ ±¸Á¶ + ¿î¿µÃ¼Á¦ ","±è¹ÎÃ¶"));
		libray.add(new Book("È¥°ø2","±è¹ÎÃ¶2"));
		libray.add(new Book("È¥°ø3","±è¹ÎÃ¶3"));
		libray.add(new Book("È¥°ø4","±è¹ÎÃ¶4"));
		libray.add(new Book("È¥°ø5","±è¹ÎÃ¶5"));
		
		for(int i = 0; i<libray.size(); i++) {
			
			libray.get(i).showInfo();
		}
	}	
	
}