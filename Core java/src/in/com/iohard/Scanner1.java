package in.com.iohard;


import java.io.FileReader;
import java.util.Scanner;

//for next line 

public class Scanner1 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\ACER\\OneDrive\\Desktop\\iohard\\dipesh.txt");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
	}
}
