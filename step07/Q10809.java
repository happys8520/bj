package boj07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10809 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String result[] = new String[26];
		for(int i = 0; i < result.length; i++) {
			result[i] = "-1 ";
		}
		
		
//		풀이1
//		for(int i = 0; i < str.length(); i++) {
//			int storage = str.charAt(i) -97;  // a -> 97
//			if( result[storage] == -1)	result[storage] = i; 
//		}
		
		//풀이2
		for(int i = str.length()-1; i >= 0; i--) {
			String alphabet = str.substring(i, i+1);	// == str.charAt(i)
														
			// indexOf(문자) = 해당 문자가 들어있는 위치를 알려줌
			switch(alphabet) {
				case "a":
					result[0] = i + " ";
					break;
				case "b":
					result[1] = i + " ";
					break;
				case "c":
					result[2] = i + " ";
					break;
				case "d":
					result[3] = i + " ";
					break;
				case "e":
					result[4] = i + " ";
					break;
				case "f":
					result[5] = i + " ";
					break;
				case "g":
					result[6] = i + " ";
					break;
				case "h":
					result[7] = i + " ";
					break;
				case "i":
					result[8] = i + " ";
					break;
				case "j":
					result[9] = i + " ";
					break;
				case "k":
					result[10] = i + " ";
					break;
				case "l":
					result[11] = i + " ";
					break;
				case "m":
					result[12] = i + " ";
					break;
				case "n":
					result[13] = i + " ";
					break;
				case "o":
					result[14] = i + " ";
					break;
				case "p":
					result[15] = i + " ";
					break;
				case "q":
					result[16] = i + " ";
					break;
				case "r":
					result[17] = i + " ";
					break;
				case "s":
					result[18] = i + " ";
					break;
				case "t":
					result[19] = i + " ";
					break;
				case "u":
					result[20] = i + " ";
					break;
				case "v":
					result[21] = i + " ";
					break;
				case "w":
					result[22] = i + " ";
					break;
				case "x":
					result[23] = i + " ";
					break;
				case "y":
					result[24] = i + " ";
					break;
				case "z":
					result[25] = i + " ";
					break;
			}
		
		}
		
		for(int i = 0; i < result.length; i++) {	// for(int i : result)
			bw.write(result[i]);					// 	bw.write(i);
		}
		
		
		bw.flush();
		bw.close();
	}

}
