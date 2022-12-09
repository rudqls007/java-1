package kr.co.ezenac.stream03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileInOutputSteam2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("output3.txt");
		FileOutputStream fos = new FileOutputStream("output4.txt");
		byte[] bs = new byte[100];
		int data = 0;
		
		while(( data = fis.read(bs)) != -1) {
			fos.write(bs);
			System.out.println(" 읽은 바이트 수 : "  + data);
		}
		fos.flush();
		System.out.println(" 복사본 파일이 생성 되었습니다.");
		
		fos.close();
		fis.close();
	}

}
