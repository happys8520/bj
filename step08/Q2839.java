package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2839 {

	public static void main(String[] args) throws Exception{
		// 5먼저하고 그다음 3
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		
		int five = 5;
		int three = 3;
		
		int input = Integer.parseInt(br.readLine());
		int fstorage = input / five;	// 5 몫
		int fremainder = input % five; //5나머지
		int tstorage = 0;	// 3 몫 
		
		while(fstorage >= 0) {

			
			if(fremainder == 0) {
				break;
			}
			else if(fremainder%three == 0)
			{
				tstorage = fremainder/three; 
				break;
			}
			fstorage--;
			fremainder += five;
		}
		if( fstorage < 0 ) {
			bw.write("-1");
		}
		else {
			bw.write(Integer.toString(fstorage + tstorage));
		}
		
		br.close();
		bw.flush();
		bw.close();
	
	}

}
