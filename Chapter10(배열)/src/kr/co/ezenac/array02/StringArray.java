package kr.co.ezenac.array02;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[7];
		
		name[0] = new String("이순신");
		name[1] = new String("이순신1");
		name[2] = new String("이순신2");
		name[3] = new String("이순신3");
		name[4] = new String("이순신4");
		name[5] = new String("이순신5");
		name[6] = new String("이순신6");
		int cnum= 0;
		for(int i =0; i<name.length; i++) {
		
		System.out.println(name[i]);
		cnum += name[i].length();
		
		
		}
		System.out.println(" 총 문자의 수 : " + cnum);
	}

}
