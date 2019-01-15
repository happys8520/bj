package boj05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1065 {

	public static int function(int n) {
		
		int arr[] = new int[4];
		int dn;
		int i = 0;
		int cnt=0;
		
		while ( n > 0) {	// 각 자리수 구하기
			dn = n % 10;	
			n = n / 10;
			arr[i] = dn;
			i++;
		}
		int gap  = arr[1] - arr[2];
		int gap2 = arr[0] - arr[1];
		if( Integer.toString(gap).equals(Integer.toString(gap2)) ) {	// 백의자리
			cnt = 1;
		} else if( arr[2]==0 ) {	//십의자리
			cnt =1;
		} else if(arr[2]==0 && arr[1]==0) {	// 일의자리
			cnt = 1;
		}
		
		return cnt;
		
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for ( int i = 1; i <= N; i++ ) {
			sum += function(i);
		}
		System.out.println(sum);
		
	}

}
