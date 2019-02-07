package boj08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1011{
	static StringTokenizer st;
	public static void main(String args[]) throws Exception {
    
//	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	  
//	  int N = Integer.parseInt(br.readLine());
//	  int cnt[] = new int[N];
//	  
//	  for(int i=0; i<N; i++) {
//		  StringTokenizer st = new StringTokenizer(br.readLine());
//		  int a = Integer.parseInt(st.nextToken());
//		  int b = Integer.parseInt(st.nextToken());
//		  int dis = b-a;
//		  
//		  int x = 0;
//		  int result = 1;
//		  while( x < dis ) {
//			  result++;
//			  x += (result/2);
//		  }
//		  cnt[i] = result -1;
//	  }
//	  
//	  for( int i = 0 ; i < cnt.length; i++) {
//		  bw.write(Integer.toString(cnt[i]) + "\n");
//	  }
//	  
//	  bw.flush();
//	  bw.close();
//	  br.close();
	  
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        st = new StringTokenizer(br.readLine());
	        
	        int t = Integer.parseInt(st.nextToken());
	        for(int i=0; i<t; i++) {
	            st = new StringTokenizer(br.readLine());
	            int x = Integer.parseInt(st.nextToken());
	            int y = Integer.parseInt(st.nextToken());
	            int movingDistance = 0;
	            int xMovingCount = 0;
	            int yMovingCount = 0;
	            
	            while(true) {
	                movingDistance++;
	                
	                x += movingDistance;
	                xMovingCount++; // x의 이동횟수
	                
	                if(x >= y) {
	                    break;
	                }
	                
	                y -= movingDistance;
	                yMovingCount++; // y의 
	                if(y <= x) {
	                    break;
	                }
	                
	            }
	            bw.write(String.valueOf(xMovingCount+yMovingCount));
	            bw.newLine();
	        }
	        bw.flush();
	  
	  
  }
}