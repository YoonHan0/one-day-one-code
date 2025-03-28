import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤_고르기 {
    public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));	// 3
		System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));	// 2
		System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));	// 1
	}
	public static int solution(int k, int[] tangerine) {
		int result = 0;
		int index = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		List<Integer> count = new ArrayList<>();

		// 귤 크기별로 개수 정리 { 크기:개수 }
		for(int t: tangerine) {
			countMap.put(t, countMap.getOrDefault(t, 0) + 1);
		}
		// 개수만 뽑아서 정리
		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			count.add(entry.getValue());
		}

		Collections.sort(count, Collections.reverseOrder());	// 내림차순으로 정렬

		while(k > 0) {
			k -= count.get(index);
			index++;
			result++;
		}
		return result;
	}
}
