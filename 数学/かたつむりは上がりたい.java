package ”Šw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ‚©‚½‚Â‚Ş‚è‚Íã‚ª‚è‚½‚¢ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] input2 = {Integer.valueOf(input[0]),Integer.valueOf(input[1]),Integer.valueOf(input[2])};
		int mok = (input2[2]-input2[1])/(input2[0]-input2[1]);
		int namuji = (input2[2]-input2[1])%(input2[0]-input2[1]);
		if(namuji==0) {
			System.out.println(mok);
		}else {
			System.out.println(mok+1);
		}
	}

}
