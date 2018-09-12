package boj;

import java.util.Scanner;

public class step03_09 {

	public static void main(String[] args) {
		
		int input1;		// 개수 입력받기
		String input2;	// 숫자 입력받기
		String change;	// char형을 string형으로
		char n;	
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		input1 = sc.nextInt();
		input2 = sc.next();
		
		for (int i=0; i<input1; i++) {
			//sum += Integer.parseInt(input2.substring(i, i+1));
			n = input2.charAt(i);
			change = new Character(n).toString();
			sum += Integer.parseInt(change);
		}
		System.out.print(sum);
		
	}
	
}
