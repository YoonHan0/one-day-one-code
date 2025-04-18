public class 예상_대진표 {
    
    public static void main(String[] args) {
		System.out.println("Hello World! > " + solution(8, 4, 7));	// 3
		System.out.println("Hello World! > " + solution(8, 1, 2));	// 1
		System.out.println("Hello World! > " + solution(16, 4, 16));	// 4
		System.out.println("Hello World! > " + solution(16, 10, 2));	// 4

	}

	public static int solution(int n, int a, int b) {
		int[] minMax = getMinMax(a, b);
		int exponent = (int) (Math.log((double)n) / Math.log(2));	// n이 2의 몇승인지 지수를 구함
		int min = minMax[0];	// 최소값
		int max = minMax[1];	// 최대값

		while(n > 1) {
			n /= 2;
			if(min <= n && max > n) { return exponent; }
			exponent--;
		}
		return 1;
	}

	public static int[] getMinMax(int a, int b) {
		int[] result = new int[]{a, b};

		if(a > b) {
			result[0] = b;
			result[1] = a;
		}
		return result;
	}
}
