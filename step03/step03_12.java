package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class step03_12 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int n = Integer.parseInt(br.readLine());
		
		/*
		StringTokenizer tokens = new StringTokenizer(br.readLine(), " ");
				
		for( int i=0; i<n; i++) {
			bw.write(tokens.nextToken() + tokens.nextToken() + "\n");
		}
		*/
		
		for (int i = 0; i < n; i++) {
			String add[] = br.readLine().split(" ");
			bw.write(Integer.parseInt(add[0]) + Integer.parseInt(add[1]) + "\n");
		}
		bw.flush();
		bw.close();
			
	}
}