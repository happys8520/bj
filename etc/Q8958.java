package boj06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q8958 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str;
		int arr[] = new int[n];
		int cnt = 1;
		int sum = 0;
		String storage = "O";
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				int[] result = new int[str.length()];
				
				if( str.substring(j, j+1).equals(storage)) {
					result[j] = cnt;
					sum += result[j];
					if( j != 0 && str.substring(j-1, j).equals(storage) ) {
						sum -= result[j];	// 앞에 내용과 같다는 조건이 없었을 때에 더해줬던 걸 빼준다.
						cnt++;
						result[j] = cnt;	// 앞에 내용과 같을 경우, cnt증가후 더해준다
						sum += result[j];
					}
				}
				else {
					result[j] = 0;
					cnt = 1;
				}
				
			}
			arr[i] = sum;
			sum = 0;
			cnt = 1;
			bw.write(Integer.toString(arr[i]) + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
