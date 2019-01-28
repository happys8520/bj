package boj07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q5622 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int seconds = 0;
		
		int i = 0;
		while (i++ < input.length()) {
			String str = input.substring(i-1, i);
			switch(str) {
				case "A":case "B":case "C":	
					seconds += 3;
					break;
				case "D":case "E":case "F":	
					seconds += 4;
					break;
				case "G":case "H":case "I":	
					seconds += 5;
					break;
				case "J":case "K":case "L":	
					seconds += 6;
					break;
				case "M":case "N":case "O":	
					seconds += 7;
					break;
				case "P":case "Q":case "R":case "S":	
					seconds += 8;
					break;
				case "T":case "U":case "V":	
					seconds += 9;
					break;
				case "W":case "X":case "Y":case "Z":	
					seconds += 10;
					break;
			}
			
		}
		
		bw.write(Integer.toString(seconds));
		bw.flush();
		bw.close();
		
	}

}
