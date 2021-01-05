package 文字列;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 英語文字探す {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}
