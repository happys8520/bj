package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2775 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int room[][] = new int[15][15];
		
		for( int i = 1; i < room.length; i++) {
			room[0][i] = i;
		}
		
		for (int a =1; a < room.length; a++) {	//층
			
			for(int b = 1; b < room[a].length; b++) {	//호
				
				room[a][b] = room[a-1][b] + room[a][b-1];
			
			}
			
		}
		
		int T = Integer.parseInt(br.readLine());
		for( int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(Integer.toString(room[k][n]) + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();

	}

}
