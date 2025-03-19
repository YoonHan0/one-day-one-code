public class 숫자의_표현 {
    
    public static void main(String[] args) {
		System.out.println("Hello World! \n" + solution(15));
	}

	public static int solution(int n) {
		int result = 0;
		int sum = 0;
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				sum += j;
				if(sum == n) {
					result++;
					break;
				}
				else if(sum > n) {
					break;
				}
			}
			sum = 0;
		}
		return result;
	}
}
