package ’å—ó;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ”šƒJ[ƒh {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine().trim());
		st = new StringTokenizer(br.readLine().trim());

		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(A);

		int M = Integer.parseInt(br.readLine().trim());
		st = new StringTokenizer(br.readLine().trim());

		for(int i=0; i<M; i++) {
			int n = Integer.parseInt(st.nextToken());
			System.out.print(binarySearch(n, A));
			System.out.print(" ");
		}

	}
	public static int binarySearch(int n , int[] A) {
	int mid;
	int right = A.length-1;
	int left = 0;
	
		while(left <= right) {
			mid = (left + right)/2;
			if(n == A[mid]) {
				return 1;
			}else {
				if(n < A[mid]) {
					right = mid -1;
				}else {
					left = mid +1;
				}
			}
		}
		return 0;
	}
}
