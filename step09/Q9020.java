package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9020 {
	
	static boolean sosuArr[];
	static int num = 0; 
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int input = Integer.parseInt(br.readLine());
		for(int i = 0; i<input; i++) {
			
			num = Integer.parseInt(br.readLine());
			sosuArr = new boolean[num];
			sosu();
			
			int mid = num/2;
			int k = mid;
			boolean flag = true;
			
			while(flag) {
				if(!sosuArr[k]) {
					for(int j = mid; j < num; j++) {
						if(!sosuArr[j] & k+j == num) {
							bw.write(k +" "+ j +"\n");
							flag = false;
						}
					}
				}
				if(k<=1) {
					flag = false;
				}
				k--;
			}
			
			/*for(int k = mid; k > 1 & !sosuArr[k]; k--) {
				if(!sosuArr[k]) {
					for(int j = mid; j < num; j++) {
						if(k+j == num) {
							bw.write(k +" "+ j +"\n");
							break;
						}
					}
				}
			}*/
			
			
		}
		br.close();
		bw.flush();
		bw.close();
		
	}

	public static void sosu() {
		sosuArr[1] = true;
		
		for(int i = 2; i < num; i++) {
			for(int j = 2; i*j < num; j++) {
				sosuArr[i*j] = true;
			}
		}
	}	
	
}
