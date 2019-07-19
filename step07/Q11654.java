package boj06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11654 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char input = br.readLine().charAt(0);
		
		int change = (int)input;
		bw.write(Integer.toString(change));
		
		bw.flush();
	}

}
