public class 점프와_순간_이동 {
    public static void main(String[] args) {

		System.out.println("Hello World! " + soluation(5));	// 2
		System.out.println("Hello World! " + soluation(6));	// 2
		System.out.println("Hello World! " + soluation(5000));	// 5

	}

	public static int soluation(int n) {
		int result = 0;
		while(n > 0) {
			if(n%2 == 1) {
				n--;
				result++;
			}
			n /= 2;
		}
		return result;
	}
}
