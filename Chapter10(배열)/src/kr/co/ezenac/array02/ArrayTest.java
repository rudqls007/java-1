package kr.co.ezenac.array02;

import java.util.Arrays;

public class ArrayTest {
 public static void main(String[] args) {
	 int[] score = null;		//score�� ����������
	 // score = {100, 200};	// �迭 ���� �Ǿ� ���� �ʾ� ���� ������ ��
	 
	 score = new int[5];
	 // �迭���� �� �ּ���
	 System.out.println(" score�� �ּ� �� :" +  score);
	 
	 for(int i = 0; i<score.length; i++) {System.out.println(" score [ " + i + "] " + score[i]);
	 }
	 System.out.println();
	 
	 int[] arr1 = new int[10];
	 
	 for(int i =0; i<arr1.length; i++) {
		 //������ 1~10������ ������ ����
		 arr1[i] = (int)(Math.random()*10) + 1;
		
	 }
	 
	 for(int i=0; i<arr1.length; i++) {
		if(i !=9) {
			System.out.println(arr1[i] + ',');
		}else {
			System.out.println(Arrays.toString(arr1));	
		}
	 }	 
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
	 }
		 
	 
	 
	 

}

