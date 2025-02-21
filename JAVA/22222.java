package JAVA;


/** 카드 뭉치 */
public class 22222 {
    public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

		System.out.println("Hello World!");
		String[] str1 = new String[]{"i", "drink", "water"};
		String[] str2 = new String[]{"want", "to"};
		String[] str3 = new String[]{"i", "want", "to", "drink", "water"};

		String result = soluation(str1, str2, str3);		// 호출 시에 바로 선언하려면 soluation(new String[] {"i", "drink", "water"}) 이렇게
		System.out.println(result);

	}
	public static String soluation(String[] cards1, String[] cards2, String[] goal) {
        //		Map<String, String> answer = new HashMap<String, String>();
        //		answer.put("yes", "YES");
        //		answer.put("no", "NO");
        //		answer.get("yes");		// or get("no");
		int x = 0;
		int y = 0;
		boolean result = false;

		for(int i=0; i<goal.length; i++) {
			if(goal[i].equals(cards1[x])) {
				x++;
			}
			else if(goal[i].equals(cards2[y])) {
				y++;
			}

			if(x == cards1.length || y == cards2.length) break;		// x == cards1.length 이면 goal에 cards1의 항목이 이어져서 있다~ 라는 의미
		}
		if(x == cards1.length) {
			goal = removeFromGoal(goal, cards1);
			result = Arrays.equals(goal, cards2);
		}
		else if(y == cards2.length) {
			goal = removeFromGoal(goal, cards2);
			result = Arrays.equals(goal, cards1);
		}

		return result ? "YES" : "NO";
	}

	public static String[] removeFromGoal(String[] goal, String[] cards) {
		List<String> goalList = new ArrayList<String>(Arrays.asList(goal));		// List 형태로 형변환

		goalList.removeAll(Arrays.asList(cards));		// 제거

		return goalList.toArray(new String[0]);
	}
}
