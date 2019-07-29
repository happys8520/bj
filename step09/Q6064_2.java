package boj09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q6064_2 {	// 카잉달력

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());	// 갯수
				
		for(int i = 0; i < input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	//<M:N x:y>
			int M = Integer.parseInt( st.nextToken() );
			int N = Integer.parseInt( st.nextToken() );
			int x = Integer.parseInt( st.nextToken() );
			int y = Integer.parseInt( st.nextToken() );
			int cnt = x; // 해 수
			int yplus = x;
			
			int lcm = lcm(M,N);
			
			while( lcm > cnt ) {
				
				if(yplus > N) {
					int mot = yplus/N;
					int difference = yplus - N*mot;
					yplus = difference;
				}
				if(yplus == y) {
					break;
				}
				
				cnt += M;
				yplus += M;

			}
			if(yplus == y) {
				bw.write( Integer.toString(cnt) + "\n");
			} else {
				bw.write("-1\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
    public static int lcm(int num1, int num2) { // 최소공배수 구하기
        
    	int result = 0;
    	boolean check = true;
    	while(check) {
    		result += num1;
    		if(result % num2 == 0) {
    			check = false;
    		}
    	}
        return result;
    }

}