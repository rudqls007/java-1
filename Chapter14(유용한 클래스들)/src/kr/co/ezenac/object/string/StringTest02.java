package kr.co.ezenac.object.string;

public class StringTest02 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String sql = new String("sql");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(sql); // 문자열 저장
		System.out.println(java.toString());	// toString을 붙이지 않아도 알아서 연결해 준다
		System.out.println(System.identityHashCode(java));
	}

}
