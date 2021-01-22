package •¶š—ñ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alphabet” {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[26];
		int apb = 0;
		
		char[] a = br.readLine().toCharArray();
		for(int i=0; i<a.length; i++) {
			apb = a[i]-97;
			num[apb]++;
		}
		for(Object obj : num) {
			System.out.print(obj + " ");
		}
	}
}
