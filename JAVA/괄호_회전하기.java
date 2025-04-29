import java.util.Arrays;
import java.util.Stack;

public class 괄호_회전하기 {
    
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

			result = correctStr(str) == 1 ? result + 1 : result;

			String lastStr = str.substring(str.length()-1);
			String restStr = str.substring(0, str.length()-1);
			str = lastStr + restStr;
		}
		return result;
	}

	public static int correctStr(String s) {
		// 올바른 괄호이면 return 1, 아니면 return 0
		Stack<String> stack = new Stack<>();
		String[] openStr = {"(", "{", "["};
		String[] splitS = s.split("");

		for(String item : splitS) {
			if(Arrays.asList(openStr).contains(item)) {
				stack.push(item);
			}
			else {		// item 이 close 괄호일 때
				if(stack.empty()) {
					return 0;
				}
				String str = stack.pop();	// open 괄호
				if(")".equals(item) && "(".equals(str)) { continue; }
				if("}".equals(item) && "{".equals(str)) { continue; }
				if("]".equals(item) && "[".equals(str)) { continue; }
				else { return 0; }
			}
		}
		return 1;
	}
}
