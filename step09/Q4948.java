package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {
	
	public static boolean[] primeNum;
	
	public static void main(String[] args) throws Exception{	//베르트랑 공준
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		
		while(input != 0) {
			int input_x2 = input * 2;
			int cnt = 0;
			primeNum = new boolean[input_x2 + 1];
			
			getPrimeNum();
			for(int i = input+1; i <= input_x2; i++) {
				if(!primeNum[i]) {
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt) + "\n");
			input = Integer.parseInt(br.readLine());
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	 public static void getPrimeNum() {		//  소수 이외에 것 제외
		 primeNum[1] = true;
		 
		 for(int i = 2; i < primeNum.length; i++) {
			 for(int j = 2; i*j <  primeNum.length; j++) {
				 primeNum[i*j] = true;
			 }
		 } 
	 }

}
