package kr.co.ezenac.array04;

import java.util.Arrays;

public class ArrayUillMethod02 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4};
		double[] arr2= {4.4, 3.3, 2.2, 1.1};
		String[] arr3 = {"�̼���", "�Ż��Ӵ�", "�ܱ�", "������"	};
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		for (int n : arr)
			System.out.print(n + "\t");
		System.out.println();
		for (double d : arr2)
			System.out.print(d + "\t");
		System.out.println();
		for (String s : arr3)
			System.out.print(s + "\t");
		System.out.println();
	}
	

}

		

