package kr.co.ezenac.array03;

public class ArrayInMethod {
		public static void main(String[] args) {
			int[] arr = makeIntArrayint(5);
			int sum =sumOfArray(arr);
			System.out.println(sum);
		}
		
		public static int[] makeIntArrayint(int len) { // �޼��� int ��ȯ�� Ÿ�����ε� �迭�� �� �� �ִ�
			int[] arr = new int[len];
			
			for(int i = 0; i<len; i++) {
				arr[i] = i;
			}
			
			return arr; // void ������ return
			
			
			
		}
		
		public static int sumOfArray(int[] arr){
		int sum = 0;
		
		for(int i =0; i<arr.length; i++)
			sum += arr[i];
		return sum;
		
		}
}
