package kr.co.ezenac.array03;

public class ArrayInMethod {
		public static void main(String[] args) {
			int[] arr = makeIntArrayint(5);
			int sum =sumOfArray(arr);
			System.out.println(sum);
		}
		
		public static int[] makeIntArrayint(int len) { // 메서드 int 반환형 타입으로도 배열을 쓸 수 있다
			int[] arr = new int[len];
			
			for(int i = 0; i<len; i++) {
				arr[i] = i;
			}
			
			return arr; // void 없으면 return
			
			
			
		}
		
		public static int sumOfArray(int[] arr){
		int sum = 0;
		
		for(int i =0; i<arr.length; i++)
			sum += arr[i];
		return sum;
		
		}
}
