package kr.co.ezenac.array02;

public class BookArrayTest {
	public static void main(String[] args) {

		Book[] book = new Book[5];

		book[0] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��", " ���ö");
		book[1] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��1", " ���ö1");
		book[2] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��2", " ���ö2");
		book[3] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��3", " ���ö3");
		book[4] = new Book("ȥ�� �����ϴ� ��ǻ�� ����+ �ü��4", " ���ö4");

		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
			
			book[i].showInfo();
		}

	}

}
