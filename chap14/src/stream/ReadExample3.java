package stream;

import java.io.*;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100];
		
		while (true) {
			int readByteNum = is.read(buffer);	// 배열 길이만큼 읽기
			if (readByteNum == -1) break;	// 파일 끝에 도달했을 경우
			for (int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
	}

}
