package •¶š—ñ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ”š”ä‚×‚é {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] input2 = input.split(" ");
		input2 = reverse(input2).split(",");
		if(Integer.parseInt(input2[0]) > Integer.parseInt(input2[1])) {
			System.out.println(input2[0]);
		}else {
			System.out.println(input2[1]);
		}
	}
public static String reverse(String[] input2) {
	return (new StringBuffer(input2[0])).reverse().toString()+","+
			(new StringBuffer(input2[1])).reverse().toString();
}
}
