package bj10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10870 {	//피보나치 수5
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		bw.write(Integer.toString(fibo(n)));
		
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
