package kr.co.ezenac.array02;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[7];
		
		name[0] = new String("�̼���");
		name[1] = new String("�̼���1");
		name[2] = new String("�̼���2");
		name[3] = new String("�̼���3");
		name[4] = new String("�̼���4");
		name[5] = new String("�̼���5");
		name[6] = new String("�̼���6");
		int cnum= 0;
		for(int i =0; i<name.length; i++) {
		
		System.out.println(name[i]);
		cnum += name[i].length();
		
		
		}
		System.out.println(" �� ������ �� : " + cnum);
	}

}
