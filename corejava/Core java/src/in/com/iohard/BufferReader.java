package in.com.iohard;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
	
	public static void main(String[] args) throws Exception {
		
		FileReader File = new FileReader("C:\\Users\\ACER\\OneDrive\\Desktop\\iohard\\dipesh.txt");
			BufferedReader reader = new BufferedReader(File);	
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
			File.close();
	}

}
