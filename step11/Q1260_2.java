package boj21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.*;

public class Q1260_2 {
	
	static Vector<Integer>[] vec;
	static boolean count[];
	static int N;
	
	public static void main(String []args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());	//정점
		int M = Integer.parseInt(st.nextToken());	//간선
		int V = Integer.parseInt(st.nextToken());	// 정점시작 번호
		
		vec = new Vector[N+1];
		
		for( int i = 1; i < N+1; i++) {
			vec[i] = new Vector<Integer>();	//정점과 간선 관계
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			vec[first].add(second);
			vec[second].add(first);
		}
		
		for(int i = 1; i < N+1; i++) {
			Collections.sort(vec[i]);
		}
		
		count = new boolean[N+1];
		DFS(V);
		System.out.println();
		
		count = new boolean[N+1];
		BFS(V);
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void DFS(int V) {
		
		if(count[V]) {
			return;
		}
		
		count[V] = true;
		System.out.print(V + " ");
		
		for(int i = 0; i < vec[V].size(); i++) {
			if(!count[vec[V].get(i)]) {
				DFS(vec[V].get(i));
			}
		}
		
	}
	
	static void BFS(int V) {
				
		count[V] = true;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		
		while(!queue.isEmpty()) {
			int first = queue.poll();
			System.out.print(first + " ");
			
			for(int i : vec[first]) {
				if(!count[i]) {
					count[i] = true;
					queue.add(i);
				}
			}
			
		}
		
		
	}

}
