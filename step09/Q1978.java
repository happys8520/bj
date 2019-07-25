package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int cnt = 0; //소수 갯수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < input; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			int N = 2; // 비교대상
			
			while( N<num ) {
				if( num%N == 0 ) {
					break;
				}
				N++;
			}
			if( num == N) {
				cnt++;
			}
			
		}
		bw.write(Integer.toString(cnt));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
