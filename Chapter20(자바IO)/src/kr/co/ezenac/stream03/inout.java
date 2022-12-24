package kr.co.ezenac.stream03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class inout {

	public static void main(String[] args) throws IOException {
		int i = 0;
		int bt = 0;
		try (FileInputStream fis = new FileInputStream("test.txt")) {
			byte[] bs = new byte[26];
			while ((i = fis.read(bs)) != -1) {
				for (int j = 0; j < i; i++)
					System.out.println((char) bs[j]);
			}
			System.out.println("바이트의 개수는" + i);
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (FileOutputStream fos = new FileOutputStream("testcopy.txt", true)) {
			byte[] bs = new byte[26];
			fos.write(bs);
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}
	}

}
