public class JadenCase문자열만들기 {
    
    public static void main(String[] args) {

		String s1 = "3people unFollowed me";
		String s2 = "for the last week";
		String result = solution(s2);
		System.out.println("Hello World! \n" + result);

	}

	public static String solution(String s) {

		String[] splitStr = s.split(" ");
		String result = "";
		String text = "";

		for (int i=0; i<splitStr.length; i++) {
			text = splitStr[i];

			if(Character.isLetter(splitStr[i].charAt(0))) {		// 첫 문자가 문자이면
				char upper = Character.toUpperCase(splitStr[i].charAt(0));	// 대문자로 변경
				text = upper+"";

				for (int j=1; j<splitStr[i].length(); j++) {	    // 수정한 첫 문자를 포함해서 문자열로 만들기
					text += splitStr[i].charAt(j);
				}
			}
			result += i == splitStr.length-1 ? text : text + " ";	// 수정된 문자열들 합쳐서 반환값으로 만들기
		}

		return result;
	}
}
