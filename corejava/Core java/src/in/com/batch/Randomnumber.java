package in.com.batch;

public class Randomnumber {
	
	public static void main(String[] args) {
		
		int max=100;
		int min=60;
		 
		int range=max-min;
		for(int i=1; i<=5; i++) {
			
			int rd=(int)(Math.random()*range);    //logic
			System.out.println(rd);
		}
		
	}

}
