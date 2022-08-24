package stream;

import java.io.*;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = { 10, 20, 30 };
		
		os.write(array);
		
		os.flush();
		os.close();
	}

}
