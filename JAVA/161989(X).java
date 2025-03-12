package JAVA;

/** 덧칠하기 */
public class Soluation0224_001 {
    public static void main(String[] args)  {
        /* 
		 *  벽의 길이 n
		 *  롤러의 길이 m
		 *  chill해야 하는 구역 section
		 */
		// 테스트 데이터
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};

		int result = solution(n, m, section);
		System.out.println("### 정답 확인 ### \n" + result);
    }

	public static int solution(int n, int m, int[] section) {
		int result = 1;
		int colorArea = section[0] + m - 1;

		for(int i=0; i<section.length; i++) {
			if(section[i] > colorArea) {
				result++;
				colorArea = section[i] + m - 1;
			}
		}
		return result;

		/* // ----- 근거는 없지만 프로그래머스에서도 돌려보기 -----
		int len = section[section.length - 1] - section[0] + 1;
		int result = 1;

		for(int i=m; i<len; i+=m) {
			result++;
		}

		return result;
		*/
	}
}
