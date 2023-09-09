package in.com.iohard;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\iohard\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		e.empId = 1;
		e.name = "hardeep";
		e.salary = 10000;
		e.bonus = 2000;
		e.total = e.salary + e.bonus;
		
		out.writeObject(e);
		file.close();
		out.close();
		System.out.println("Successfull");
		
	}

}
