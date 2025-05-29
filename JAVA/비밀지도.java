package JAVA;

import java.util.Arrays;

public class 비밀지도 {
    
    public static void main(String[] args) {

		System.out.println("========================");
		System.out.println("1번 " + Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
		System.out.println("2번 " + Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] result = new String[n];

		for(int i=0; i<arr1.length; i++) {
			StringBuilder answer = new StringBuilder();
			String binary1 = Integer.toBinaryString(arr1[i]);
			String binary2 = Integer.toBinaryString(arr2[i]);

			binary1 = binary1.length() < n ? "0".repeat(n-binary1.length()) + binary1 : binary1;
			binary2 = binary2.length() < n ? "0".repeat(n-binary2.length()) + binary2 : binary2;

			for(int j=0; j<n; j++) {
				char ch1 = binary1.charAt(j);
				char ch2 = binary2.charAt(j);

				String ans = ch1 == '0' && ch2 == '0' ? " " : "#";
				answer.append(ans);
			}
			result[i] = answer.toString();
		}
		return result;
	}
}
