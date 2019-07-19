package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1712 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt( st.nextToken() );	// 고정비용
		int B = Integer.parseInt( st.nextToken() ); // 가변비용
		int C = Integer.parseInt( st.nextToken() ); // 노트북 가격
		
		/*int productionTotal = A; // 생산 비용
		int saleTotal = 0; // 판매 비용
		int i = 0;	// 판매 대수
		
		if( B < C) {
			while(productionTotal >= saleTotal) {
				productionTotal += B;
				saleTotal += C;
				i++;			
			}
			bw.write( Integer.toString(i) );
		}
		else {
			bw.write("-1");
		}*/
		
		// ------------ 쉬운방법 ------
		// 'A + Bx < Cx' >>> 'A < (C-B)x' >>> 'A/(C-B) < x' 
		if( B < C) {
			bw.write(Integer.toString( A/(C-B)+1 ));
		}
		else {
			bw.write("-1");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}