package boj11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1472 {	// 소트인사이드

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		int charArr[] = new int[N.length()];
		
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = N.charAt(i);
		}
		Arrays.sort(charArr);
		
		for(int i = charArr.length -1; i >= 0; i--) {
			bw.write(charArr[i]);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
