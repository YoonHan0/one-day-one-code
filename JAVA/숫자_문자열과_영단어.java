package JAVA;

import java.util.Map;

public class 숫자_문자열과_영단어 {
    
    public static void main(String[] args) {

		System.out.println("HelloWorld~!");
		System.out.println(solution("one4seveneight"));		// 1478
		System.out.println(solution("2three45sixseven"));	    // 234567
		System.out.println(solution("23four5six7"));			// 234567
		System.out.println(solution("123"));					// 123
	}
	public static String solution(String s) {
		Map<String, String> map = Map.of(		// 불변 Map 생성
				"zero", "0",
				"one", "1",
				"two", "2",
				"three", "3",
				"four", "4",
				"five", "5",
				"six", "6",
				"seven", "7",
				"eight", "8",
				"nine", "9"
		);
		for(String key : map.keySet()) {
			if(s.contains(key)) {		// String.contains(String)
				s = s.replace(key, map.get(key));
			}
		}
		return s;
	}
}
