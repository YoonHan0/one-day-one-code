import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 카펫 {
    public static void main(String[] args) {

		System.out.println("Hello World! " + Arrays.toString(soluation(10, 2)));	// [4, 3]
		System.out.println("Hello World! " + Arrays.toString(soluation(8, 1)));	// [3, 3]
		System.out.println("Hello World! " + Arrays.toString(soluation(24, 24)));	// [8, 6]

	}

	public static int[] soluation(int brown, int yellow) {

		List<int[]> yellowXy = func1(yellow);
		for(int[] item : yellowXy) {
			System.out.println("> " + Arrays.toString(item));
			if( (((item[0]+2) * (item[1]+2)) - brown) == yellow) {
				return new int[]{item[0]+2, item[1]+2};
			}
		}
		return new int[]{1, 0};
	}

	public static List<int[]> func1(int yellow) {

		List<int[]> yellowXy = new ArrayList<>();	// 동적으로 할당할거면 ArrayList<int[]> 형태로 선언

		for(int i=yellow; i>=1; i--) {
			if(yellow / i > i) { break; }	// x < y 일 때 break
			if(yellow % i == 0) {
				yellowXy.add(new int[]{i, yellow/i});	// 동적으로 할당
			}
		}
		return yellowXy;
	}
}
