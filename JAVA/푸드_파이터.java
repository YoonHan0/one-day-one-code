package JAVA;

import java.util.ArrayList;
import java.util.List;

public class 푸드_파이터 {
    
    public static void main(String[] args) {

		System.out.println("Hello World!11");
		System.out.println("### " + solution(new int[]{1, 3, 4, 6}));		// 1223330333221
		System.out.println("### " + solution(new int[]{1, 7, 1, 2}));		// 111303111
	}

	public static String solution(int[] food) {

		List<Integer> temp = new ArrayList<>();
		StringBuilder result = new StringBuilder();

		for(int i=1; i<food.length; i++) {
			food[i] = food[i] % 2 == 0 ? food[i] : food[i] - 1;
			if(food[i] == 0) {
				temp.add(0);
			} else {
				temp.add(food[i] / 2);
			}

		}	// [2, 4, 6] -> [1, 2, 3]

		for(int i=0; i<temp.size(); i++) {
			String addStr = Integer.toString(i+1).repeat(temp.get(i));
			result.append(addStr);
		}

		return result.toString() + "0" + result.reverse().toString();
	}
}
