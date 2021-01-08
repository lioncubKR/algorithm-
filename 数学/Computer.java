package ”Šw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Computer {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] point = br.readLine().split(" ");
		int[] cost = {Integer.valueOf(point[0]),Integer.valueOf(point[1]),Integer.valueOf(point[2])};
		int sum = cost[2] - cost[1];
		int cnt = 0;
		if(sum > 0 && cost[1] < cost[2]) {
			cnt = cost[0]/sum;
		}
		if(cnt > 0 || cost[0]<(cost[2]-cost[1])) {
			System.out.println(cnt+1);			
		}else if(cnt <= 0) {
			System.out.println(-1);
		}
	}
}
