package boj21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1714 {	//음식물피하기
	
	static boolean map[][] = new boolean[100][100];
	static boolean check[][] = new boolean[100][100];
	static int x[] = {1,-1,0,0};
	static int y[] = {0,0,1,-1};
	static int cnt= 1;
	static int N;
	static int M;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());	//가로
		M = Integer.parseInt(st.nextToken());	//세로
		int K = Integer.parseInt(st.nextToken());	//음식물 개수
		
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a-1][b-1] = true;
		}
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				
				// 한번 체크한 곳이면 다시 개수 계산할 필요가 없기에 && 음식물이 있는곳인가
				if(!check[i][j] && map[i][j]) {	
					cnt = 0;
					func(i,j);
					
					if( max < cnt ) {
						max = cnt;
					}
				}
				
			}
		}
		bw.write(Integer.toString(cnt));
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void func(int a, int b) {	// 땅크기 보기.
		for(int i = 0; i < 4; i++)
		{
			int xx = a + x[i];
			int yy = b + y[i];
			
			if( 0<=xx && xx<N && 0<=yy && yy<M && map[xx][yy] && !check[xx][yy]) {
				cnt++;
				check[xx][yy] = true;
				func(xx, yy);
			}
		}
	}
	
}
