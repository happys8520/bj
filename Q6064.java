package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q6064 {	//시간초과, 카잉 달력

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int GCD = 0; // 최대 공약수 구하기
			for ( int j = 1; j <= Math.min(M,N); j++ ) {
				if ( M%j == 0 && N%j == 0 ) {
					GCD = j;
				}
			}
			
			int cnt = 0;
			int x_cnt = 0;
			int y_cnt = 0;
			int LCM = M*N / GCD;	//최소공배수
			
			boolean flag = true;
			while (flag) {
				
				if ( x_cnt < M ) {
					x_cnt++;
				} else {
					x_cnt = 1;
				}
				
				if ( y_cnt < N ) {
					y_cnt++;
				} else {
					y_cnt = 1;
				}
				
				cnt++;		
				if( x_cnt == x && y_cnt == y ) {
					flag = false;
				} else if( cnt > LCM ) {
					cnt = -1;
					flag = false;
				}
			
			}
			bw.write( Integer.toString(cnt) + "\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
		
		
	}

}
