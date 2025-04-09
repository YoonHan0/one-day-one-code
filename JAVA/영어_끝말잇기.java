import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 영어_끝말잇기 {
    public static void main(String[] args) {

		int[] result = solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});	// [3, 3] 번호, 차례
		int[] result2 = solution(2, new String[]{"tank", "kick", "know", "know"});	// [2, 2] 번호, 차례
		int[] result3 = solution(4, new String[]{"tank", "kick", "know", "know"});	// [4, 1] 번호, 차례

		System.out.println("Hello World!11 " + Arrays.toString(result));
		System.out.println("Hello World!11 " + Arrays.toString(result2));
		System.out.println("Hello World!11 " + Arrays.toString(result3));

	}

	public static int[] solution(int n, String[] words) {

		System.out.println("Parameter > " + n + ", " + Arrays.asList(words).toString());

		// 9번째가 틀림 -> 9 / n(=3) = 3번째 차례에 틀림 | 9 % 3 = 0, n(=3)+0 => 3번째 사람이
		// 4번째 틀림 -> 4 / n(=2) = 2번째 차례에 틀림 | 4 % 2 = 0, n(=2)+0 => 2번째 사람이
		// 4번째 틀림 -> 4 / n(=4) = 1번째 차례에 | 4 % 4 = 0, n(=4)+0 => 4번째 사람이

		/*
		* 1. words에 동일한 문자열이 있는지 확인
		* 2. 있으면
		* 	 순회하면서 동일한 문자열의 index 확인 후 계산
		* 3. 없으면
		* 	 startCh, endCh를 정의, 첫 문자열의 시작글자, 끝글자로 초기화
		* 	 순회하면서 동일한지 비교 모두 동일하면 [0,0] 리턴
		*    아니라면 해당 index를 가지고 계산
		* */
		if(hasDuplicate(words) != -1) {
			/* 동일한 문자열이 있으면 */
		}
		else {
			/* 동일한 문자열이 없으면 */
		}

		return new int[]{3,3};
	}

	/* 동일한 문자열이 있으면 index 반환, 없으면 -1 반환 */
	public static int hasDuplicate(String[] words) {
		Set<String> set = new HashSet<>();
		for(int i=0; i<words.length; i++) {
			if(!set.add(words[i])) return i;	// set.add()를 할 때 이미 존재하는 값을 추가하려고 하면 false를 반환함.
		}
		return -1;
	}
}