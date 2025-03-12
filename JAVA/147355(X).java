package JAVA;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
		int result1 = solution("1234567", "7");
		int result2 = solution("10203", "15");
		System.out.println(result1 + " / " + result2);

    }

	/** 크기가 작은 부분 문자열 */
    public static int solution(String t, String p) {
		int chunkSize = p.length();
		int pNumber = Integer.parseInt(p);
		int result = 0;

		for (int i = 0; i <= t.length() - chunkSize; i++) {
			String subStr = t.substring(i, i + chunkSize);
			int subInt = Integer.parseInt(subStr);

			if (subInt <= pNumber) {
				result++;
			}
		}
		return result;
		/* ----- 개선전 코드 -----
		int index = 0;
		int chuckSize = p.length();
		int pNumber = Integer.parseInt(p);
		int result = 0;
		boolean equalsSize = t.substring(index).length() == chuckSize;

		while(true) {
			String subStr = "";
			if(equalsSize) {
				subStr = t.substring(index);
			}
			else {
				subStr = t.substring(index, index+chuckSize);
			}
			int subInt = Integer.parseInt(subStr);

			if(pNumber >= subInt) { result++; }
			if(equalsSize) break;
			index++;
		}
		return result;
		*/
	}
}
