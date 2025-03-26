public class 짝지어_제거하기 {
    public static void main(String[] args) {

		System.out.println("Hello World! " + solution("baabaa"));	// 1
		System.out.println("Hello World! " + solution("bbaa"));	// 1
		System.out.println("Hello World! " + solution("baab"));	// 1
		System.out.println("Hello World! " + solution("cdcd"));	// 0
		System.out.println("Hello World! " + solution("abcd"));	// 0
	}

	public static int solution(String s) {
		StringBuilder sb = new StringBuilder();

		for(char c : s.toCharArray()) {		// s.toCharArray() => char[] temp = {'b', 'a', 'a', 'b', 'a', 'a'}
			int len = sb.length();
			if(len > 0 && c == sb.charAt(len-1)) {
				sb.deleteCharAt(len-1);
			}
			else {
				sb.append(c);
			}
		}
		return sb.isEmpty() ? 1 : 0;    // or sb.length() == 0 ? 1 : 0
	}
}