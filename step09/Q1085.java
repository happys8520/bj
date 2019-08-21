package boj09;

import java.util.Scanner;

public class Q1085 { // 직사각형에서 탈출

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int result;
		
		if( (w-x)>x?true:false ) {	// y축 0에 가까울경우
			
			if( (h-y)>y?true:false ) {  //x출 0에 가까울경우
 				if(x>y) {
 					result = y;
 				} else {
 					result = x;
 				}
			} else {
				if(x>(h-y)) {
 					result = h-y;
 				} else {
 					result = x;
 				}
			}
				
		} else { // w와 가까울 경우
			
			if( (h-y)>y?true:false ) {  //x출 0에 가까울경우
 				if((w-x)>y) {
 					result = y;
 				} else {
 					result = w-x;
 				}
			} else {
				if((w-x)>(h-y)) {
 					result = h-y;
 				} else {
 					result = w-x;
 				}
			}
			
		} 	System.out.println(result);
		
	}

}
