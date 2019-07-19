package boj07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test1157 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String str = br.readLine().toUpperCase();
		int alphabet[] = new int[26];
		
		for (int i = 0; i < str.length(); i++) {	// 각각의 알파벳 나온 개수
			alphabet[str.charAt(i)-65] += 1;
		}
		
		int max = alphabet[0];
		String storage = "A";		// 제일 첫 max는 alphabet[0].즉, A
		for( int i = 1; i <alphabet.length; i++) {		
			if( max < alphabet[i]) {
				max = alphabet[i];
				char a  = (char)(i+65);
				storage = Character.toString(a);
			} else if( max == alphabet[i]) {
				storage = "?";
			} 
		}
		
		bw.write(storage);
		bw.flush();
		bw.close();
		
		
		
	}

}
