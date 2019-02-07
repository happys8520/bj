package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// 첫번째 줄에 수의 합은 2. = i번재 줄 -> 합: i+1  /  문제풀 때 for문 주의 
		for( int i = 1; cnt <= N; i++) {
			
			if( i % 2 == 0) {	// i+1
				for( int j = 0; j < i; j++) {
					String row = Integer.toString(j+1);
					cnt++;
					if( cnt == N) 
						bw.write( row + "/" + Integer.toString((i+1)-(j+1)) );
				} 
			} else {
				for( int j = i; j > 0; j--) {
					String row = Integer.toString(j);
					cnt++;
					if( cnt == N )
						bw.write(row + "/" + Integer.toString( (i+1) -j) );
				}
			}
		
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
