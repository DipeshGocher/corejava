package in.com.batch;

public class Practice2 {

public void sum(int a, int b, int e) {
	int c= a+b+e;
	System.out.println("sum="+c);
}
public void mult(int a, int b) {
	int c = a*b;
	System.out.println("mult="+c);
}
public void notecount (int number) {
	int[] note = { 500, 200, 100, 50, 20, 10, 5, 2, 1};
	int count=0;
	for (int i = 0; i < note.length; i++) {
		count= number/note[i];
		
		if (count>0) {
			System.out.println(note[i]+ "="+count);
		}
		number = number%note[i];
			
		}
	}
	public static void main(String[] args) {
		Practice2 p= new Practice2();
		p.sum(10,2,3);
		p.mult(5,4);
		p.notecount(15534);
		
	}
	
	
}

