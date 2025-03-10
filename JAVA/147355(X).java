package JAVA;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
		int result = soluation("1234567", "7");
		System.out.println(result);

    }

	/** 크기가 작은 부분 문자열 */
    public static int soluation(String t, String p) {
		int answer = 0;
		int start = 0;
		int chunkSize = p.length();
		int numberP = Integer.parseInt(p);

		while( start < t.length() ) {
			int end = Math.min( start+chunkSize, t.length() );
			int numberT = Integer.parseInt( t.substring(start, end) );

			if( numberP >= numberT ) { answer++; }
			start = start + chunkSize;
		}
		return answer;
	}
}
