package boj04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class addition2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), three = 0, five = n/5; n %=5;
		
		while (five >= 0 ) {
			if(n%3 == 0) {
				three = n/3;
				n %= 3;
				break;
			}
			five--;
			n+=5;
		}
		System.out.printf("%d", n == 0? five + three : -1);
		sc.close();

	}

}
