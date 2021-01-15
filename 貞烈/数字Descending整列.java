package ’å—ó;
import java.util.*;
public class ”šDescending®—ñ {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		char[] num = scn.next().toCharArray();
		Integer[] num2 = new Integer[num.length];
		for(int i=0; i<num.length; i++) {
			num2[i] = Integer.valueOf(num[i]-48);
		}
		Arrays.sort(num2, Collections.reverseOrder()); 
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]);
		}
		
	}

}
 
