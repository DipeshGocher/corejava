package in.com.batch;

public class TwoDarray {
public static void main(String args[]) {
	
	int [][]table = new int [6][6];
	for(int i=0; i<table.length; i++) {
		for(int j=0; j<table.length; j++) {
			
			table[i][j]= (i+1)*(j+1);                 // logic
			System.out.print( table [i][j]+"\t");
		}
		System.out.println();
			
		}
	}
}

