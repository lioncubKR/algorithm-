package ���;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ���W���� {
	public static class Point{
		Integer x;
		Integer y;
		public Point(int x , int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		Point[] points = new Point[cnt];
		
		for(int i=0; i<points.length; i++) {
			String[] input = br.readLine().split(" ");
			points[i] = new Point(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
		}
		
		Arrays.sort(points , new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				if(o1.x.equals(o2.x)) {
					return o1.x - o2.x;
				}else {
					return o1.y - o2.y;
				}	
			}			
		});
        StringBuilder builder = new StringBuilder();
        for(Point p: points)
            builder.append(String.format("%d %d\n",p.x, p.y));
        System.out.print(builder);
	}

}
