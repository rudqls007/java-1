package kr.co.ezenac.array02;

class BoxA4{
	public String name;

	public BoxA4(String name) { // ������ ����
		super();
		this.name = name;
	}
	
	
}


public class BoxArray {

	
	
	public static void main(String[] args) {
		
		BoxA4[] box = new BoxA4[3];
		
		//�迭�� ��ü ����(�ʱ�ȭ)
		
		box[0] = new BoxA4("�̼���0");
		box[1] = new BoxA4("�̼���1");
		box[2] = new BoxA4("�̼���2");
		
		// ����� ��ü�� ����
		System.out.println(box[0].name);
		System.out.println(box[1].name);
		System.out.println(box[2].name);
	}
}
