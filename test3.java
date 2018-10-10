package boj04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test3 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input[] = br.readLine().split(" ");	// 배열의 원소개수 N개와 정수X
		String array[] = br.readLine().split(" ");	// 배열 원소  입력
		
		for (int i = 0; i < Integer.parseInt(input[0]); i++) {
			if(Integer.parseInt(input[1]) > Integer.parseInt(array[i])) {
				bw.write(array[i] + " ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}