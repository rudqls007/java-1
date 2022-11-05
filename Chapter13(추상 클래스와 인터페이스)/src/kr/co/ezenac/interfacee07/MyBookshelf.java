package kr.co.ezenac.interfacee07;

public class MyBookshelf extends BookShelf implements Queue {

	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
	}


	@Override
	public String deQueue() {
		return bookshelf.remove(0);
		
	}

}
