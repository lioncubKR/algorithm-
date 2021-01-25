package 文字列;

import java.util.Scanner;
import java.util.Stack;

public class かっこ {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.nextLine();
		
		String[] expression = new String[num];
		
		for(int i=0; i<expression.length; i++) {
			expression[i] = scn.nextLine();
		}
		for(int i=0; i<expression.length; i++) {
			System.out.println(stack(expression[i]));
		}
	}
	public static String stack(String str) {
		Stack st = new Stack();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				st.push(ch + "");
			}else if(ch == ')') {
				if(st.isEmpty()) {
					return "NO";
				}else {
					st.pop();
				}
			}				
		}
		if(st.isEmpty()) {
			return "YES";
		}else {
			return "NO";
		}
	}
}