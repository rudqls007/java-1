package kr.co.ezenac.stream05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long ms =0;
		
		try(FileInputStream fis = new FileInputStream("ojdbc8.jar");
				FileOutputStream fos = new FileOutputStream("copy.jar");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
					ms = System.currentTimeMillis();
					
					int i;
					while(( i = bis.read()) != -1) 
						bos.write(i);
					ms = System.currentTimeMillis() - ms;
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		System.out.println("파일 복사하는 데 " + ms + " millisecond  소요되었습니다.");
		
	}

}
