package kr.co.ezenac.LinkedList;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		System.out.println();
		list.insertElement(3, "D");
		list.printAll();
		System.out.println();
		list.removeElement(0);
		list.printAll();
		System.out.println();
		list.removeElement(1);
		list.printAll();
		System.out.println();
		list.insertElement(0, "A-1");
		list.printAll();
		System.out.println(list.getSize());
		System.out.println();

		list.removeElement(0);
		list.printAll();
		System.out.println(list.getSize());
		System.out.println();
		list.removeAll();
		list.printAll();
		System.out.println();
		list.addElement("A");
		list.printAll();
	}

}
