import java.util.ArrayList;
import java.util.List;

public class 피보나치의_수 {
    public static void main(String[] args) {
		
		int result1 = solution(3);	// 2
		int result2 = solution(5);	// 5
		System.out.println("Hello World! " + result1 + ", " + result2);
	}

	public static int solution(int n) {
		/*
		* 1) n번째 까지의 피보나치 수를 구하는 메서드
		* 2) n번 째 수를 리턴 받아서 1234567로 나눈 나머지를 리턴
		* - 피보나치 수란?
		* n+2번째 수 = n+1번째 수 + n번째 수
		* n번째 수 = n-1번째 수 + n-2번째 수
		* */
		// 피보나치 수 init
		List<Integer> pibonachi = new ArrayList<>();
		pibonachi.add(0);
		pibonachi.add(1);
		// 출력하기: System.out.println(pibonachi.toString()), pibonachi만 작성해도 toString()이 호출돼서 출력 가능
		// 피보나치 수 만들기
		for(int i=2; i<=n; i++) {
			int inputNumber = pibonachi.get(i-1) + pibonachi.get(i-2);
			pibonachi.add(inputNumber);
		}

		return pibonachi.get(n) % 1234567;
	}
}
