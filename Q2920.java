package boj06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2920 {

	public static void main(String[] args) throws Exception {
		String asc[] = new String[8];
		String desc[] = new String[8];
		
		for(int i = 0; i < asc.length; i++) {
			asc[i] = Integer.toString(i+1);
		}
		for(int i = desc.length-1; i >= 0; i--) {
			desc[i] = Integer.toString(i+1);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=0; i<input.length-1; i++) {
			
			if( Integer.parseInt(input[i]) == Integer.parseInt(input[i+1])-1 ) {
				cnt1++;
			} else if( Integer.parseInt(input[i]) == Integer.parseInt(input[i+1])+1 ) {
				cnt2++;
			}
			
		}
		
		if( cnt1 == 7 ) {
			System.out.println("ascending");
		}
		else if( cnt2 == 7 ) {
			System.out.println("descending");
		}
		else if( cnt1 < 7 && cnt2 < 7 ){
			System.out.println("mixed");
		}

		
		
	}

}
