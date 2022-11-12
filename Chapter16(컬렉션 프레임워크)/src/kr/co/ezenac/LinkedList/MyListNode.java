package kr.co.ezenac.LinkedList;

public class MyListNode {

	private String data; // 자료
	public MyListNode next; // 다음 노드를 가리키는 링크

	public MyListNode() { // 기본 생성자
		data = null; // 참조 변수 null로 초기화
		next = null; // ""

	}

	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}

	public String getData() {
		return data;
	}
	
	
}
