package JAVA;

public class n^2_배열_자르기 {
    public static void main(String[] args) {
        System.out.println("Hello World! " + Arrays.toString(solution(3, 2, 5)));		// [3, 2, 2, 3]
        System.out.println("Hello World! " + Arrays.toString(solution(4, 7, 14)));		// [4, 3, 3, 3, 4, 4, 4, 4]
//		System.out.println("Hello World! " + Arrays.asList(new String[]{"1", "1", "1", "1"}));		// 예시
            }
        
    public static int[] solution (int n, int left, int right) {

        int[][] arr = new int[n][n];
        int[] result = new int[n*n];

        // 2차원 배열 세팅
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = i >= j ? i+1 : j+1;
            }
            System.out.println("### 1차 확인 " + Arrays.toString(arr[i]));
            int y = 0;
            for(int z=i*n; z<(i*n)+n; z++) {
                result[z] = arr[i][y];
                y++;
            }
        }
        System.out.println("1차원 배열로 전개 " + Arrays.toString(result));

        return Arrays.copyOfRange(result, left, right+1);
    }
}
