package stream;

import java.io.*;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2, 3);	// 입력스트립으로부터 3byte를 읽고 buffer[2],[3],[4]에 각각 젖장
		if (readByteNum != -1) {
			for (int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
	}
}
