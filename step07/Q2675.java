package boj07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2675 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		String P[] = new String[T];
		for( int i = 0; i < T; i++) {
			
			String S = br.readLine();
			int S1 = Integer.parseInt(S.substring(0,1));	// 반복횟수
			String S2 = S.substring(2, S.length());			// 문자열
			String storage = "";							// 문자열 누적을 위한 초기치 선언
			
			for(int j = 0; j < S2.length(); j++) {
				for(int k = 0; k < S1; k++) {
					storage += S2.substring(j, j+1);
				}
			}
			P[i] = storage;
			
		}
		
		for( int i = 0; i < P.length; i++) {
			bw.write(P[i] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
