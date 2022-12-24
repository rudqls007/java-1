package kr.co.ezenac.stream03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class input1 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input3.txt")) {
			FileOutputStream fos = new FileOutputStream("output3.txt", true);

			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} System.out.println("복사 되었습니다.");
	}

}