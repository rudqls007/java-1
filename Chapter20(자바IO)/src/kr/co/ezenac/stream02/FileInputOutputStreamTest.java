package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		int i = 0;
		int cnt = 0;
		int tot = 0; // 읽어온 바이트 수

		fis = new FileInputStream("FileStream.txt");
		fos = new FileOutputStream("copyFile.txt", true);
		byte buf[] = new byte[30]; // 메모리를 일시적으로 저장하기위한 buffer을 이용했다. 나중에 자세히 배운다. 이 배열이 buffer 와 같은 기능을 한다는 것만
									// 알아두면 된다.
		while ((i = fis.read(buf)) != -1) { // 여기서 n은 읽은 바이트 수
			fos.write(buf, 0, i); // 쓰는게 아니라 스트림에 넣는느낌
			fos.flush(); // 데이터를 직접 파일에다가 쓰는 과정 (스트림에 있는걸 이제 적용)
			cnt++;
			tot = +i;

		}
		System.out.println("cnt: " + cnt);
		System.out.println(tot + "바이트가 복사 되었습니다");
	}
}