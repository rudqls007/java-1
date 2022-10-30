package kr.co.ezenac.array02;

class BoxA4{
	public String name;

	public BoxA4(String name) { // 생성자 생성
		super();
		this.name = name;
	}
	
	
}


public class BoxArray {

	
	
	public static void main(String[] args) {
		
		BoxA4[] box = new BoxA4[3];
		
		//배열에 객체 저장(초기화)
		
		box[0] = new BoxA4("이순신0");
		box[1] = new BoxA4("이순신1");
		box[2] = new BoxA4("이순신2");
		
		// 저장된 객체의 참조
		System.out.println(box[0].name);
		System.out.println(box[1].name);
		System.out.println(box[2].name);
	}
}
