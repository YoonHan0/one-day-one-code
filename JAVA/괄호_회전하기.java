import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class 괄호_회전하기 {
    
    private static final Set<Character> openStr = Set.of('(', '{', '[');

    public static void main(String[] args) {
		System.out.println("Hello World! " + solution("[](){}"));
		System.out.println("Hello World! " + solution("}]()[{"));
		System.out.println("Hello World! " + solution("[)(]"));
		System.out.println("Hello World! " + solution("}}}}"));
	}

	public static int solution(String s) {

		/*
		* 1. 올바른 괄호인지 확인하는 메서드 (올바르면 +1, 아니면 +0)
		* 2. 문자열을 옮기는 로직
		* */
		int result = 0;
		String str = s;

		for(int i=0 ;i<s.length(); i++) {

			result = correctStr(str) ? result + 1 : result;

			String lastStr = str.substring(str.length()-1);
			String restStr = str.substring(0, str.length()-1);
			str = lastStr + restStr;
		}
		return result;
	}

	public static boolean correctStr(String s) {
		// 올바른 괄호이면 return 1, 아니면 return 0
		Stack<Character> stack = new Stack<>();

		for(int i=0; i<s.length(); i++) {
			char item = s.charAt(i);

			if(openStr.contains(item)) {
				stack.push(item);
			}
			else {		// item 이 close 괄호일 때
				if(stack.empty()) { return false; }
				char str = stack.pop();	// open 괄호
				if(')' == item && '(' != str) { return false; }
				if('}' == item && '{' != str) { return false; }
				if(']' == item && '[' != str) { return false; }
			}
		}
		return stack.empty();
	}
}
