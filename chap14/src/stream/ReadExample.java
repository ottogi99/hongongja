package stream;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		
		while (true) {
			int data = is.read();	// 1byte�� �б�
			if (data == -1) break;	// ���� ���� �������� ���
			System.out.println(data);
		}
		
		is.close();
	}

}
