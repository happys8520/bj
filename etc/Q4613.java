package boj05;

import java.util.ArrayList;

public class Q4613 {
	
	public static String d(int n) {
		
		int dn = n;
		
		while(n > 0) {
			dn = dn + n % 10;
			n /= 10;
		}
		return Integer.toString(dn);
		
	}
	
	public static void main(String[] args) {
			
		ArrayList<String> array = new ArrayList<>();
		for ( int i = 1; i <= 10000; i++) {
			array.add(Integer.toString(i));
		}
		
		int n = 1;
		while (n <= 10000) {
			array.remove(d(n));
			n++;
		}
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));	
		}
		
			
	}

}