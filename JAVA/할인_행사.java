public class 할인_행사 {
    
    import java.util.HashMap;

public class 할인_행사 {

    public static void main(String[] args) {

		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {
				"chicken", "apple", "apple", "banana", "rice", "apple", "pork",
				"banana", "pork", "rice", "pot", "banana", "apple", "banana"
		};
		System.out.println("Hello World!11 " + solution(want, number, discount));
	}

	public static int solution(String[] want, int[] number, String[] discount) {

		/*
			슬라이딩 윈도우란?
			배열이나 문자열에서 일정한 길이의 범위를 정해놓고, 그 범위를 한 칸씩 옆으로 옮기면서 검사하는 방법
	
			윈도우를 옮길 때 전체 다시 계산하는 게 아니라, 앞의 하나 빼고 뒤에 하나 더하는 방식으로 하면 O(n)까지 줄일 수 있어요.
			- 기존 코드:
			while(10+i < discount.length) {
				String[] sliced = Arrays.copyOfRange(discount, i, 10+i);	-> 윈도우를 옮기 때마다 배열을 새로 생성
				...
		*/
		HashMap<String, Integer> mappingWant = new HashMap<>();
		for(int i=0; i<want.length; i++) {
			mappingWant.put(want[i], number[i]);
		}

		for(int i=0; i<=discount.length - 10; i++) {
			Map<String, Integer> countMap = new HashMap<>();
			for(int j=i; j<i+10; j++) {
				countMap.put(discount[j], countMap.getOrDefault(discount[j], 0) + 1);	// countMap.get(key값)을 했을 때 객체에 해당하는 key값이 없으면 null을 반환하는데 이러면 타입을 지정하지 못하기 떄문에 default값을 정해주면서 예외 처리를 할 수 있다.
			}

			boolean isMatch = true;
			for(Map.Entry<String, Integer> entry : mappingWant.entrySet()) {
				String key = entry.getKey();	// 구매할 품목
				int cnt = entry.getValue();		// 구매할 수량

				if(cnt != countMap.getOrDefault(key, 0)) {
					isMatch = false;
					break;
				}
			}
			if(isMatch) { return i+1; }
		}

		return 0;
	}
}

}
