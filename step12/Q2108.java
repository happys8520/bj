package boj11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2108 {	// 통계학

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());	// 몇개 입력받을지
		int arr[] = new int[input];
		int sum = 0;
		int storage = 0; //최빈값 저장
		int count[] = new int[8001];	// 음수, 양수, 0.
		int cnt = 0;	// 최빈값  여러개일 경우 두번째로 작은 값을 알아내기 위해
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			count[ arr[i]+4000 ]++;	// 입력받은 값의 빈도수 체크
		}
	
		
		Arrays.sort(arr);
		
		int big = 0;
		for(int i = 0; i < count.length;i++) {	// 최빈값찾기
			if( big < count[i]) {
				big = count[i];
			}
		}
		
		for(int i = 0; i < count.length; i++) {	//최빈값 여러개일 경우 두번째로 작은값 알아내기
			if( big == count[i] ) {
				cnt++;
				storage = i-4000;
			}
			if(cnt == 2) {	
				break;
			}
		}
		
		bw.write( Integer.toString((int)Math.round((double)sum/input)) + "\n");	//산술 평균
		bw.write( Integer.toString(arr[input/2]) + "\n");	//중앙값
		bw.write( Integer.toString(storage) + "\n" );	//최빈값
		bw.write( Integer.toString(arr[input-1]-arr[0]) );	//범위

		br.close();
		bw.flush();
		bw.close();
	}

}
