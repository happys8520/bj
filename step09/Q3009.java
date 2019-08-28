package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3009 {	// 네번째 점

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x[] = new int[3];
		int y[] = new int[3];
		int X, Y;	// 결과값
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());		
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = i+1; j < 3; j++) {
			
				if(x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
				if(y[i] > y[j]) {
					int temp = y[i];
					y[i] = y[j];
					y[j] = temp;
				}
				
			}
		}
		
		if(x[0]==x[1]) {
			X = x[2];
		} else {
			X = x[0];
		}
		
		if(y[0]==y[1]) {
			Y = y[2];
		} else {
			Y = y[0];
		}
		
		bw.write( Integer.toString(X) + " " + Integer.toString(Y));
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}