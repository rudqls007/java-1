package kr.co.ezenac.decsion;

import java.util.Scanner;

public class IfelseTest01 {

	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0111";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" ID : ");
		
		String id = scan.nextLine();
		
		if(!id.equals(ADMIN_ID)) {
			System.out.println("False");
			
			scan.close();
			return;
			
		}
		System.out.print(" PW: ");
		String pw = scan.nextLine();
		
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("True");
			
		}
		else { 
			System.out.println("False");
			
		
			
		}
		scan.close();
	}
	

}
