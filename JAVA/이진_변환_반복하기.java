import java.util.Arrays;
import java.util.stream.Collectors;

public class 이진_변환_반복하기 {
    
    public static void main(String[] args) {

		String s1 = "110010101001";		// [3, 8]
		String s2 = "01110";			// [3, 3]
		String s3 = "1111111";			// [4, 1]

//		int[] result = solution(s1);
//		System.out.println("Hello World! \n" + Arrays.toString(result));
//
//		int[] result2 = solution(s2);
//		System.out.println("Hello World! \n" + Arrays.toString(result2));

		int[] result3 = solution(s3);
		System.out.println("Hello World! \n" + Arrays.toString(result3));

	}

	public static int[] solution(String s) {
		/*
		* 1) s에서 '0'을 모두 제거
		* 2) 제거된 숫자의 길이 s, 제거된 0의 개수도 카운팅
		* 3) s를 이진법으로 변경 ( ex/ s=4 일 때 "100" )
		* 4) 다시 1을 반복
		* 5) 1이 된다면 종료
		* return [ 반복횟수, 제거된 0의 개수 ]
		* */
		int cnt0 = 0;		// 사라지는 0의 개수
		int count = 0;		// 반복 횟수
		String binary = s;	// 2진수
		String tempS = "";

		while(!"1".equals(binary)) {
			tempS = Arrays.stream(binary.split(""))
					.filter(ch -> !"0".equals(ch))
					.collect(Collectors.joining());
			cnt0 += binary.length() - tempS.length();
			binary = Integer.toBinaryString(tempS.length());
			count++;
		}

		return new int[]{count, cnt0};
	}
}
