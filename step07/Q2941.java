package boj07;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Q2941 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine().trim();

        // 방법 1.        
//        int cnt = 0;
//        int length = input.length();
//        
//        for(int i=0; i<length; i++) {
//            cnt++;
//            switch(input.charAt(i)) {	//substring(i, i+1)
//                case 'c':
//                    if(i < length-1 && (input.charAt(i+1)=='=' || input.charAt(i+1)=='-')) {	// index 벗어나는것을 방지하기위한 조건
//                        i++;
//                    }
//                    break;
//                case 'd':
//                    if(i < length-2 && input.charAt(i+1)=='z' && input.charAt(i+2)=='=') {
//                        i+=2;
//                    }else if(i < length-1 && input.charAt(i+1)=='-') {
//                        i++;
//                    }
//                    break;
//                case 'l': case 'n':
//                    if(i < length-1 && input.charAt(i+1)=='j') {
//                        i++;
//                    }
//                    break;
//                case 's': case 'z':
//                    if(i < length-1 && input.charAt(i+1)=='=') {
//                        i++;
//                    }
//                    break;
//            }
//        }
//      
        
        //방법2
        String alphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i < alphabet.length; i++) {
        	if(input.contains(alphabet[i])) {
        		input = input.replaceAll(alphabet[i], "a");	// alphbet배열과 겹치는 문자a로 변환
        	}
        }
        
        
        
        
        bw.write(Integer.toString(input.length()));
        bw.flush();
        bw.close();
        br.close(); 
    }
}




