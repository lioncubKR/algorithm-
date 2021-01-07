package •¶š—ñ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ’PŒê” {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tango = br.readLine().trim();
		String[] tango2 = tango.split(" ");	
		if(tango.isEmpty()) tango2 = new String[0];
		System.out.println(tango2.length);
	}
}
