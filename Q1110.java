package boj04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputN = Integer.parseInt(br.readLine());
		int change = inputN;
		
		int cnt =0;
		
		do {
			int left = change / 10;
			int right = change % 10;
			
			change = right + left;
			change = change % 10;
			change = right*10 + change;
			cnt++;
		} while( change != inputN );
		bw.write(Integer.toString(cnt));
		
		bw.flush();
		bw.close();
		
	}
}
