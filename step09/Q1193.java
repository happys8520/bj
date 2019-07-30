package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {	// 분수찾기

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int i  = 1;
		int asc = 1;
		int desc = i;
		
		while(cnt < num) {
			asc = 1;
			desc = i;
			
			while(desc > 0 && cnt < num) {
				
				cnt++;
				asc++;
				desc--;
				
			}
			i++;
		}
		
		if(i % 2 != 0) {
			bw.write(Integer.toString(asc-1)+ "/"+ Integer.toString(desc+1) + "\n");
		} else {
			bw.write(Integer.toString(desc+1)+ "/"+ Integer.toString(asc-1) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
}
