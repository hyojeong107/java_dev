package ch09.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName : ch09.app
 * @fileName    : FileWriterEx.java
 * @autor       : TJ
 * @date        : 2024.12.24
 * @description :키보드로 입력받은 문자를 텍스트 파일에 쓰기 
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.24 hyojeong
 */
public class FileWriterEx {
	public static void main(String[] args) {
//		1. 키보드(System.in:InputStream)에서 한문자(Reader)씩 읽기 스트림
		InputStreamReader isr = new InputStreamReader(System.in);
		
//		2. 텍스트파일에 쓰기를 할 수 있는 클래스 : FileWriter
		FileWriter fw=null;
		int c;
		try {
			fw = new FileWriter("c:\\temp\\test.txt");
			while((c=isr.read())!= -1) {
				fw.write(c); // 한문자씩 파일에 저장
			}
			isr.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}// try end
		
		
	} // main end
} // class end

