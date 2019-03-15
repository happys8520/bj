package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2751 {	// 합병정렬

	static int sort[];
	
	static void mergeSort(int arr[], int b, int e, int m) {
		
		int begin = b;
		int m2 = m + 1;
		int i = b;
		
		while( begin <= m || m2 <= e ) {
			
			if (begin <= m && m2 <= e) {	// 두 인덱스가 범위를 벗어나지않았을 경우 (두 배열의 원소..)
				if(arr[begin] <= arr[m2]) {
					sort[i] = arr[begin++];
				}
				else {
					sort[i] = arr[m2++];
				}
			} 
			else if (begin <= m && m2 > e) {	// 하나의 인덱스가 범위를 벗어났을 경우
				sort[i] = arr[begin++];
			}
			else {
				sort[i] = arr[m2++];
			}
			i++;
			
		}
		
		for( i = b; i < e + 1; i++) {	// 합병
			arr[i] = sort[i];
		}
		
	}
	
	static void merge(int arr[], int b, int e) {
		
		int mid;
		if( b < e ) {
			mid = (b+e)/2;
			merge(arr, b, mid);
			merge(arr, mid+1, e);	
			mergeSort(arr, b, e, mid);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();	// 속도 향상
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		sort = new int[arr.length];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		merge(arr, 0, N-1);		
		
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(arr[i]) + "\n");
//			sb.append(arr[i] + "\n");
		} 
//		System.out.println(sb);
	
		br.close();
		bw.flush();
		bw.close();
	}

}
