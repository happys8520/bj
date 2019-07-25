package boj09;

import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();	// 최소
		int N = sc.nextInt();	// 최대
		int sum = 0; // 소수 누적합 
		int cnt =0;
		int minimum = 0;
		for (int i = M; i<=N; i++) {
			int n = 2;
			while( n<i ) {
				if(i%n == 0) {
					break;
				}
				n++;
			}
			if(i==n) {
				cnt++;
				if(cnt == 1) {
					minimum = i;
				}
				sum += n;
			}
		}
		
		if(sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum + "\n" + minimum);
		}
		
	}

}