package JAVA;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Soluation0306_001 {

    /* 추억점수 */
    public static void main(String[] args) {

		System.out.println("Hello World!");
		/* 16:15-20 문제읽기 */
		/* 16:20-25 데이터 세팅 */
		/* 16:25-40 문제해결 */
		String[] name = {"kali", "mari", "don"};
		int[] yearning = {11, 1, 55};
		String[][] photo = {
				{"kali", "mari", "don"},
				{"pony", "tom", "teddy"},
				{"con", "mona", "don"}
		};
		int[] result = solution(name, yearning, photo);

		System.out.println("### 결과 ### \n" + Arrays.toString(result));
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] result = new int[photo.length];
		int score = 0;
		Map<String, Integer> map = new HashMap<>();

		for(int i=0; i<name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		/* ----- 개선전 ----- */
		// for(int j=0; j<photo.length; j++) {
		// 	for(int z=0; z<photo[j].length; z++) {
		// 		String target = photo[j][z];
		// 		if(map.containsKey(target)) {
		// 			score += map.get(target);
		// 		}
		// 	}
		// 	result[j] = score;
		// 	score = 0;
		// }

		for (int j = 0; j < photo.length; j++) {
			for (String person : photo[j]) {
				result[j] += map.getOrDefault(person, 0);		// getOrDefault(): 첫 인자에 해당하는 키 값이 없으면 default로 두 번째 인자값을 반환
			}
		}

		return result;
	}
}
