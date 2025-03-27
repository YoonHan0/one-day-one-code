public class 구명보트 {
    
    public static void main(String[] args) {

		System.out.println("Hello World! " + solution(new int[]{100, 50, 80, 50}, 150));	// 2
		System.out.println("Hello World! " + solution(new int[]{70, 80, 50}, 100));		// 3

	}
	public static int solution(int[] people, int limit) {
		List<Integer> stack = new ArrayList<>();
		int result = 0;

		for(int i=0; i<people.length; i++) {
			stack.add(people[i]);
			if(stack.size() >= 2) {	// 최대인원
				if(limit >= sum(stack)) {
					stack.clear();
					result++;
				}
				else {
					int maxValue = Collections.max(stack);
					int maxIndex = stack.indexOf(maxValue);
					stack.remove(maxIndex);
					result++;
				}
			}
		}
		return result + stack.size();
	}

	public static int sum(List<Integer> stack) {
		int sum = 0;
		for (int num : stack) {
			sum += num;
		}
		return sum;
	}
}
