import java.util.Arrays;

public class N개의_최소공배수 {

    public static void main(String[] args) {

        System.out.println("Hello World!11 " + solution(new int[]{2, 6, 8, 14}));		// 168
		System.out.println("Hello World!11 " + solution(new int[]{1, 2, 3}));			// 6
    }

    public int solution(int[] arr) {
		/*
		두 수 a, b의 최소공배수(LCM)는 a * b / gcd(a, b)
		최대공약수(GCD) 구하는 방법: gcd(18 % 12, 12) → gcd(6, 12) → gcd(0, 6) → 6
		* */
		Arrays.sort(arr);
		int num = arr[arr.length - 1];
		for(int i=arr.length-2; i>=0; i--) {
			num = getLcm(num, arr[i]);
		}
		return num;
	}

	public int getLcm(int a, int b) {
		return (a * b) / getGcd(a, b);
	}

	public int getGcd(int a, int b) {
		// a: 큰 수, b: 작은 수
		int temp = 0;
		while(b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}