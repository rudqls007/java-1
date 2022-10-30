package kr.co.ezenac.array05;

import java.util.Arrays;

public class TwoDimension {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 } };

		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");

			}
			// 각각 행의 length를 출력
			
			System.out.println(", \t" + arr[i].length);
			System.out.println();
		}
		

	}

}
