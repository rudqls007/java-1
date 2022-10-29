package kr.co.ezenac.loop02;

import java.util.Scanner;

//*******
//******
//****
//***
//**
//*
public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
//		int size = 8;  // 제일 큰 8개의 별 개수를 출력하기 위해 변수 size 값에 8을 넣어준다
//		
//		for( int i = 0;  i<size; i++) { 		// 변수 i 를 만들고 별 숫자가 8개이므로 i를 size(8)보다 작게끔 만든다
//			for(int j =0; j<size; j++) {		// 변수 j 를 똑같이 만들고 size보다 더 작게끔 만든다
//				if( i+ j < 8)							// 공통적으로 8보다 큰 숫자가 맨 앞줄로 와 있기 때문에 8보다 작은 숫자를 출력한다
//				System.out.print( " * ");		// 8보다 작은 숫자이기때문에 8보다 작은 변수 값만 나오므로 내가 원하는 예제의 * 모양이 나온다
//				
//				
//				
//			}
//			int x = 0;  // 변수 x에 0 값을 출력
//			for(int i = 0; i<8; i++) { // 변수 i 값을 0으로 출력하고 변수 i는 8보다 작은 값을  출력하게끔 만들고 i는 1 씩 증가한다
//				for (int j=0; j<8-x; j++) {	// 변수 j 값을 0으로 출력하고 변수 j는  8 - x라는 값을 출력하게 만들고 j도 1 씩 증가한다
//					System.out.print("*"); // *을 출력한다
//					
//				}
//				x++; // 모두 끝내고 x를 1씩 더한 값을 출력하게끔 주 for 문 바깥으로 x를 1씩 추가한다
		
		 	for(int i = 0; i<8; i++) {
		 		for (int j=i; j<8; j++) {
		 			System.out.print("*");
		 		}
		 		System.out.println();
		 	}
				 
			}
				
			
			
			
		}
	
	


