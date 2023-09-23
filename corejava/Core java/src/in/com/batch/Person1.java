package in.com.batch;

import java.util.Date;

public class Person1 {
	
	private String name = null;
	private int id=0;
	private Date dob=null;
	
	public void SetName(String name) {
		this.name=name;
	}
	public String getName () {
		return name;
	}
	public void SetId(int id) {
		this.id=id;
		}
	public int getId() {
	      return id;
	}
	public void SetDob(Date dob) {
		this.dob=dob;
	}
	public Date getDob() {
		return dob;
		
	}
}
