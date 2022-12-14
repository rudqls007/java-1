package kr.co.ezenac.stream03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileInOutputSteam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		int i = 0; // 변수
		int bt = 0; // 바이트 수
		fis = new FileInputStream("inputStream.txt");
		fos = new FileOutputStream("OutputStream.txt", true);
		byte[] bs = new byte[8];

		while ((i = fis.read(bs)) != -1) { // 여기서 i은 읽은 바이트 수
			fos.write(bs);;
			fos.flush(); // 데이터를 직접 파일에다가 쓰는 과정 (스트림에 있는걸 이제 적용)

			bt += i;
		}
		System.out.println(bt + " 바이트의 수 입니다.");
		System.out.println("복사 되었습니다.");
	}

}
