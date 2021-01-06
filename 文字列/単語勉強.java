package •¶Žš—ñ;

public class ’PŒê•×‹­ {

	public static void main(String[] args) throws Exception {
		int[] alphabetCnt=new int[26];
		for(int c = System.in.read(); c>='A'; c=System.in.read()) {
			alphabetCnt[Character.toUpperCase(c) - 'A']++;
		}
		
		int index = 0;
		boolean isDuplicated=false;
		for(int max = -1, i=0; i<26; i++) {
			if(alphabetCnt[i] > max ) {
				max = alphabetCnt[i];
				index = i; isDuplicated=false;
			}else if(alphabetCnt[i] == max) isDuplicated=true;
		}
		if(isDuplicated) System.out.print("?");
		else System.out.print((char)(65+index));
	}

}
