package boj04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4344 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int c = Integer.parseInt(br.readLine());	// 개수
		float avr[] = new float[1000];
		int n = 0;
		
		for (int i = 0; i < c; i++) {
			String str = br.readLine();
			String[] row = str.split(" ");
			avr[i] = 0;
			
			for (int j = 0; j < row.length; j++) {
				avr[i] += Integer.parseInt(row[j]);
			}
			avr[i] = (avr[i] - Float.parseFloat(row[0])) / Float.parseFloat(row[0]);
			
			for(int j = 0; j < row.length; j++) {
				if(avr[i] < Float.parseFloat(row[j])) n++;
			}
			avr[i] = n / Float.parseFloat(row[0]) * 100;
			n = 0;
			
		}
		
		for( int i = 0; i < c; i++) {
			bw.write(String.format("%.3f", avr[i]) + "%\n");
		}
		
		bw.flush();
		bw.close();
	}

}