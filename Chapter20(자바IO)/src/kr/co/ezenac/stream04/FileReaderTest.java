package kr.co.ezenac.stream04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("reader.txt");
		
		int i;
		while(( i = fr.read()) != -1)
			System.out.println((char)i);
		
		
		fr.close();
		
	}
	
}
