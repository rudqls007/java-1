package kr.co.ezenac.stream04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try (FileWriter fileWriter = new FileWriter("writer.txt")) {

			fileWriter.write('A'); // 문자 하나 출력
			char[] buf = { 'B', 'C', 'D', 'E', 'F', 'G' };
			fileWriter.write(buf); // 문자 배열 출력

			fileWriter.write("안녕하세요. 좋은 아침입니다."); // 문자열 출력
			fileWriter.write(buf, 1, 2);//문자 배열의 일부 출력
			fileWriter.write("65");//숫자 그대로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료 되었습니다.");
	}

}
