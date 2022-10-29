package kr.co.ezenac.decsion;

import java.util.Scanner;

public class IfelseTest02 {
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0111";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id1;
		String pw1;
		String id2;
		String pw2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID : 아이디를 입력 해주세요 ");
		id1 = scan.nextLine();
		
		System.out.println("PW :  비밀번호를 입력 해주세요 ");
		pw1 = scan.nextLine();
		
		System.out.println("ID : 아이디를 한번 더입력 해주세요 ");
		id2 = scan.nextLine();
		
		System.out.println("PW : 비밀번호를 한번 더 입력 해주세요 ");
		pw2 = scan.nextLine();
		
		
		if (pw1.equals(pw2) && id1.compareTo(id2) !=0)
		System.out.println(" 아이디가 일치하지 않습니다");
		
		else if (id1.equals(id2) && pw1.compareTo(pw2) !=0)
		System.out.println("비밀번호가 일치하지 않습니다");
		
		else if(id1.equals(id2) && pw1.equals(pw2))
		System.out.println(" 입력하신 아이디와 비밀번호가 모두 정확 합니다");
		
		else
		System.out.println("입력하신 아이디와 비밀번호 모두 일치하지 않습니다");
		
		
		
		
	}

	}

