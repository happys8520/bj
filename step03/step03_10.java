package boj;
import java.util.Scanner;

public class step03_10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char ch;
		
		int i = 0;
		while( i < str.length()  ) {
		
			ch = str.charAt(i);
			System.out.print(ch);
			
			if ( i % 10 == 9 ) {
				System.out.println();
			}
		
			
			i += 1;
				
		}
	
		
	}
	
}
