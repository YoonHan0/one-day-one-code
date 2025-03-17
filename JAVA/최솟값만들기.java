import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
		int[] num1 = {1, 3, 7};
		int[] num2 = {2, 4, 5};
		int result = solution(num1, num2);
		System.out.println("Hello World! \n" + result);
	}

	public static int solution(int[] A, int[] B) {
		int result = 0;
		int[] num1 = A.clone();
		Arrays.sort(num1);
		int[] num2 = Arrays.stream(B)
				.boxed()					    // int -> Integer 변환, int에는 내림차순 정렬을 지원하지 않기에 Integer로 변환이 필요
				.sorted((a, b) -> b - a)	    // 내림차순 정렬
				.mapToInt(Integer::intValue)    // Integer -> int 변환
				.toArray();	                    // 배열 형태로 변환

		for(int i=0; i<num1.length; i++) {
			int mul = num1[i] * num2[i];
			result += mul;
		}
		return result;
	}
}


