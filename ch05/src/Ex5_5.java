import java.util.Scanner;

class Ex5_5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수(-1이 입력될 때까지)>>>");
		
		int sum;
		int max = 0;
		sum = scan.nextInt();
		
		if(max != -1) {                                  
					sum += max; // sum = sum + max;
				if(max < sum) {
					System.out.println(" 가장 큰 수는 " + sum);
				}
				
		}else {
			System.out.println(" 프로그램을 종료합니다. ");
		}

	}
}