import java.util.Arrays;
import java.util.stream.Collectors;

public class 다음_큰_숫자 {
    public static void main(String[] args) {

		int result = solution(78);		// 78(1001110) -> 83(1010011)
		int result2 = solution(15);		// 15(1111) -> 23(10111)
		System.out.println("Hello World! " + result + ", " + result2);
	}

	public static int solution(int n) {
		/*
		* 자연수 n이 주어질 때 다음 큰 수를 구하여라
		* 1) n을 이진수로 변환, 1의 개수를 저장
		* 2) while(true)로 n을 1씩 증가, 증가된 자연수를 이진수로 변환 후 1의 개수를 체크
		* 3) 1의 개수가 동일해지면 break 하고 해당 자연수 리턴
		* */
		/*	----- 개선전 -----
		String binaryN = Integer.toBinaryString(n);
		int binaryN1Cnt = Arrays.stream(binaryN.split(""))	// 파라미터 n이 이진수일 때 가지는 '1'의 개수
				.filter(t -> "1".equals(t))
				.collect(Collectors.joining())
				.length();
		int result = 0;

		while(true) {
			n++;
			String binaryNplus = Integer.toBinaryString(n);
			int len1 = Arrays.stream(binaryNplus.split(""))
					.filter(t -> "1".equals(t))
					.collect(Collectors.joining())
					.length();
			if(len1 == binaryN1Cnt) {
				result = Integer.parseInt(binaryNplus, 2);
				break;
			}
		}
		return result;
		*/
		/*		--- 두 번째 개선 코드 ---
		String binaryN = Integer.toBinaryString(n);
		long nCnt = binaryN.chars().filter(c -> c == '1').count();
		while(true) {
			long nextNcnt = Integer.toBinaryString(++n).chars().filter(c -> c == '1').count();
			if(nCnt == nextNcnt) {
				return n;
			}
		}
		 */
		//		--- 최종코드 ---
		int binaryNcnt = Integer.bitCount(n);	// 정수 n이 이진수일 때 1의 개수를 리턴
		while(true) {
			n++;
			if(Integer.bitCount(n) == binaryNcnt) {
				return n;
			}
		}
	}
}
