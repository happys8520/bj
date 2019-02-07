package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10250 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int num[] = new int[T];
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt( st.nextToken() );	// 층 수
			int W = Integer.parseInt( st.nextToken() ); // 방 수
			int N = Integer.parseInt( st.nextToken() ); // 몇번째 손님
			
			if ( N%H==0 ) {
				num[i] = H*100 + N/H;
				
			} else {
				num[i] = (N%H)*100 + (N/H+1);
			}
		}
			
			for( int S: num) {
				bw.write( Integer.toString(S) +"\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
	
	}
}