public class 올바른괄호 {
    
    public static void main(String[] args) {
		
		String s1 = "()()";
		String s2 = "(())()";
		String s3 = ")()(";
		String s4 = "(()(";
		Boolean result = solution(s3);
		System.out.println("Hello World! \n" + result);

	}

	public static Boolean solution(String s) {
		int cnt = 0;
		for (int i=0; i<s.length(); i++) {
			if ('(' == s.charAt(i)) {
				cnt++;
			}
			else {
				cnt--;
			}
			if(cnt < 0) { return false; }
		}
		return cnt == 0;
	}
}
