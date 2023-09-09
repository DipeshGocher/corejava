package in.com.iohard;


import java.io.FileReader;

public class Filereader1 {
	
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:\\Users\\ACER\\OneDrive\\Desktop\\iohard\\dipesh.txt");
		
		int ch = reader.read();
		while(ch!= -1) {
			System.out.print((char)ch);
			ch = reader.read();
		}
		reader.close();
	}

}
