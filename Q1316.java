package boj07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1316 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String str;
		int cnt = N;
		int alphabet[] = new int[26];
			
		
		for( int i = 0; i < N; i++) {
			str = br.readLine();
			alphabet[str.charAt(0)-97] = 1;
			
			for( int j = 1; j<str.length(); j++) {
				
				if (str.charAt(j-1) != str.charAt(j) && alphabet[str.charAt(j)-97] == 1) {	// 앞에서 나왔던 알파벳인가 체크
					cnt--;
					break;
				}
				alphabet[str.charAt(j)-97]=1;
				
			}
			alphabet = new int[26];				
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
		
	}

}
