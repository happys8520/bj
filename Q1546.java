package boj04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		float sum = 0;
		float n = Float.parseFloat(br.readLine());
		String input[] = br.readLine().split(" ");
	
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				
				if(Integer.parseInt(input[i])>Integer.parseInt(input[j])) {
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				
			}
		}
		float max = Integer.parseInt(input[(int)n-1]);
		for (int i = 0; i < n; i++) {
			input[i]= Float.toString(Float.parseFloat(input[i])/max*100);
			sum += Float.parseFloat(input[i]);
		}  
		bw.write(Float.toString(sum/n));
		bw.flush();
		bw.close();
		
	}

}