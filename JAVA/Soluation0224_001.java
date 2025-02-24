package JAVA;

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

		int result = soluation(n, m, section);
		System.out.println("### 정답 확인 ### \n" + result);
    }


	public static int soluation(int n, int m, int[] section) {
		int start = section[0];
		int end = section[section.length - 1];
		int len = end - start + 1;
		
		int result = ( len / m ) + ( len % m );

		return result;
	}
}
