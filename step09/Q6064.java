package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q6064 {	// 카잉달력

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());	// 갯수
				
		for(int i = 0; i < input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	//<M:N x:y>
			int M = Integer.parseInt( st.nextToken() );
			int N = Integer.parseInt( st.nextToken() );
			int x = Integer.parseInt( st.nextToken() );
			int y = Integer.parseInt( st.nextToken() );
			int cnt = 0; // 해 수
			int xplus = 0;
			int yplus = 0;
			boolean flag = true;
			
			while( flag ) {
				
				xplus += 1; 
				yplus += 1;
				cnt += 1;
				
				if(xplus <= M && yplus <= N) {
					cnt = -1;
					flag = false;
				} else if (xplus == x && yplus == y) {
					flag = false;
				} else if(yplus > N) {
					yplus = 1;
				} else if(xplus > M) {
					xplus = 1;
				}	

			}
			bw.write( Integer.toString(cnt) + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}