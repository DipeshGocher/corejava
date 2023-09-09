package in.com.iohard;

import java.io.FileWriter;

import java.io.PrintWriter;

public class Printwriter1 {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\ACER\\OneDrive\\Desktop\\iohard\\dipesh.txt");
		PrintWriter out = new PrintWriter(file);
		out.println("i am dipesh");
		out.println("placed in IBM");
		out.println("i am happy");
		file.close();
		out.close();
		System.out.println("succesfull");
	}

}
