package character;

import java.io.*;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char[] array = { 'A', 'B', 'C' };
		
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
