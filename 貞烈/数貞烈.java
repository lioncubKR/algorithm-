package ’å—ó;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ”’å—ó {

	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int num = scn.nextInt();
		int cnt = 0;
		while(num>cnt) {
			set.add(scn.nextInt());
			cnt++;
		}
		List<Integer> sort = new ArrayList<Integer>(set);
		Collections.sort(sort);
		for(int i : sort)
			System.out.println(i);
	}
}