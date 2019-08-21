package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2292 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int i = 1;
		int count = 0;
		
		while( count < n )	{
			if(i == 1)  {
				count++;
			} else {
				count += 6*(i-1);
			}
			i++;
		}
		
		bw.write(Integer.toString(i-1));
		bw.flush();
		bw.close();
		br.close();
		
	}

}