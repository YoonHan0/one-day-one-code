public class 구명보트 {
    
    public static void main(String[] args) {

		System.out.println("Hello World! " + solution(new int[]{70, 50, 80, 50}, 100));	// 3
		System.out.println("Hello World! " + solution(new int[]{70, 80, 50}, 100));		// 3
	}

	public static int solution(int[] people, int limit) {
		int temp = people[0];
		int result = 0;
		for(int i=1; i<people.length; i++) {
			/*
			* temp, people[i]랑 비교
			* 두 개 더해서 limit보다 크면 temp = people[i], 둘 중에 작은 수를 temp로 초기화, result++
			* 					 작으면 temp = 0, result++
			* */
		}
		// for문이 끝나고 temp > 0 이면 result++
		return result;
	}
}
