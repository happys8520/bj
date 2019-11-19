package boj13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003 {	// 피보나치 함수
	
	static int zero = 0;
	static int one = 0;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int arr[][] = new int[41][2];
		arr[0][0] = 1;	// 0번째 경우
		arr[1][1] = 1;	// 1번째 경우
		
		for(int i = 2; i < 41; i++) {
			arr[i][0] = arr[i-1][0] + arr[i-2][0];
			arr[i][1] = arr[i-1][1] + arr[i-2][1];
		}
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			bw.write( Integer.toString(arr[n][0]) + " " + Integer.toString(arr[n][1])  + "\n");
			
		}
		
		
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	static int fibo(int num) {
		
		if(num > 1) {
			return fibo(num-1) + fibo(num-2);
		}
		return num;
	}


}
