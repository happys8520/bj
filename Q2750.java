package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2750 {		//선택정렬

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				
				if( arr[i] > arr[j] ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

/*
for(int i = 1; i < N; i++) {
	for(int j = 0; j < N-i; j++) {
		
		if( arr[j] > arr[j+1]) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp
		}
		
	}

}
*/