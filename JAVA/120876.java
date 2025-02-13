package JAVA;

class Solution {
    public int solution(int[][] lines) {
        /* 수정이 불가능한 리스트 생성 */
		/*
		List<List<Integer>> lines = Arrays.asList(
				Arrays.asList(0, 1),
				Arrays.asList(2, 5),
				Arrays.asList(3, 9)
		);
		*/
		
		/* 수정이 가능한 리스트 생성 */
		/*
		List<List<Integer>> lines = new ArrayList<>();
		
		lines.add(new ArrayList<>(Arrays.asList(0, 1)));
		lines.add(new ArrayList<>(Arrays.asList(2, 5)));
		lines.add(new ArrayList<>(Arrays.asList(3, 9)));
		*/
		
		/* 배열 형태로 생성 */
//		int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
//		int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
//		int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        
        
        int[] points = new int[201];		// 크기가 201인 배열 생성, 0으로 채워짐
		int result = 0;
		
		for(int i=0; i<lines.length; i++) {
			for(int j=lines[i][0]; j<lines[i][1]; j++) {
				points[j+100]++;
			}
		}
		for(int i=0; i<points.length; i++) {
			if(points[i] >= 2) result++;
		}
        return result;
    }
}
