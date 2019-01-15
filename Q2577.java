package boj06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int arr[] = new int[10];
		int result = A * B * C;
		
		int storage = result;
		while ( result > 0) {
			storage = result % 10;
			result = result / 10;
			arr[storage]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		
	}

}
