package boj04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String add[] = br2.readLine().split(" ");
		
		for(int j = 0; j<2; j++) {
			for(int k = 1; k<3; k++) {
				if( Integer.parseInt(add[j]) > Integer.parseInt(add[k]) ) {
					String temp = add[j];
					add[j] = add[k];
					add[k] = temp;
				}
			}
		}bw2.write(add[1]);
		bw2.flush();
		bw2.close();
	
	}

}
