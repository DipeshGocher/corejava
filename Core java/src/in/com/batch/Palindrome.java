package in.com.batch;

import java.util.Scanner;

public class Palindrome {
	
	
/*	public static void main(String[] args) {
		int a=1551;
		int b=a;
		int c=0;
		int d;
		
		while(b>0) {
			
			d=b%10;
			
			c=c*10+d;
			
			b=b/10;
		}
		
		if (a==c) {
			
			
			System.out.println("yes this is palindrome");
			
		}else {
			
			
			System.out.println("not this is not");
		}
		
		
		
		
		
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=
					str.charAt(str.length()-1-i)){
				System.out.println("Not palindrome");
				return;
			}
		}
		System.out.println("palindrome");
	}

}
