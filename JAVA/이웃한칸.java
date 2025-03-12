package JAVA;

public class 이웃한칸 {
    public static void main(String[] args) {

		String[][] board = {
				{"blue", "blue", "yellow"},
				{"blue", "yellow", "yellow"},
				{"yellow", "yellow", "blue"}
		};
		int h = 0, w = 2;
		int result = solution(board, h, w);
		System.out.println(result);
	}

	public static int solution(String[][] board, int h, int w) {

		int[][] loc = {
				{0, -1},
				{-1, 0},
				{1, 0},
				{0, 1},
		};
		int result = 0;
		String target = board[h][w];

		for (int i=0; i<loc.length; i++) {
			int[] location = loc[i];
			int x = w + location[0];
			int y = h + location[1];
			if(x >= 0 && y >= 0 && y < board.length && x < board[0].length && target.equals(board[y][x])) { result++; }

        }
		return result;
	}
}
