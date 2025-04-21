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
	*/
		HashMap<String, Integer> mappingWant = new HashMap<>();

		for(int i=0; i<want.length; i++) {
			mappingWant.put(want[i], number[i]);
		}
//		String[] sliced = Arrays.copyOfRange(discount, 0, 10);

//		HashMap<String, Integer> countMap = new HashMap<>();
//		for (String item : sliced) {
//			countMap.put(item, countMap.getOrDefault(item, 0) + 1);
//		}

		return 1;
	}
}

}
