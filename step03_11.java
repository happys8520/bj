package boj;

import java.util.Scanner;

public class step03_11 {

	public static void main(String[] args) {
		
		String x, y;
		
		Scanner input = new Scanner(System.in);
		x = input.next();	// 월 입력받기
		y = input.next();	// 일 입력받기
		int cnt = 0;
		
		String date[][] = new String[13][32];
		String days[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int month = Integer.parseInt(x);
		int day = Integer.parseInt(y);
		
		for(int i = 1; i<=12; i++)
		{
			if(i == 1 || i == 3 || i == 5 || i == 7 
					|| i == 8 || i == 10 || i == 12) {
				for(int j = 1; j<=31; j++) {
					date[i][j] = days[cnt];
					cnt += 1;
					if( cnt%7 == 0) {
						cnt = 0;
					}
				}
			}
			
			else if(i == 2) 	{
				for(int j = 1; j<=28; j++) {
					date[i][j] = days[cnt];
					cnt += 1;
					if( cnt%7 == 0) {
						cnt = 0;
					}
				}
			}
			
			else {
				for(int j = 1; j<=30; j++) {
					date[i][j] = days[cnt];
					cnt += 1;
					if( cnt%7 == 0) {
						cnt = 0;
					}
				}
			}
		}
		
		System.out.println( date[Integer.parseInt(x)][Integer.parseInt(y)] );
		
	}
}
