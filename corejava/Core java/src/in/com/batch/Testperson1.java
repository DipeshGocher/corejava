package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson1 {

	public static void main(String[] args) throws ParseException {
		String str = "17/08/2023";
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Person1 p = new Person1();
		p.SetName("dipesh");
		p.SetId(11);
		p.SetDob(sdf.parse(str));
		
		System.out.println(p.getDob());
		System.out.println(p.getId());
		System.out.println(p.getName());
		
		
		
		
	}
}
