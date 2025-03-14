package JAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class 데이터분석 {
    public static void main(String[] args) {

		// code, date, maximum, remain
		int[][] data = {
				{1, 20300104, 100, 80},
				{2, 20300804, 847, 37},
				{3, 20300401, 10, 8},
				{4, 20300315, 50, 50}
		};
		String ext = "date";
		int valExt = 20300501;
		String sortBy = "date";

		int[][] result = solution(data, ext, valExt, sortBy);
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}

	public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

		String[] type = {"code", "date", "maximum", "remain"};
		int extIndex = 0;
		int sortIndex = 0;
		ArrayList<int[]> filteredList = new ArrayList<>();

		for(int i=0; i<type.length; i++) {
			if(type[i].equals(ext)) {
				extIndex = i;
			}
			if(type[i].equals(sort_by)) {
				sortIndex = i;
			}
		}
		for(int x=0; x< data.length; x++) {
			if(data[x][extIndex] < val_ext) {
				filteredList.add(data[x]);
			}
		}
		int[][] result = new int[filteredList.size()][4];
		for (int j=0; j<filteredList.size(); j++) {
			result[j] = filteredList.get(j);
		}

		int[] temp = new int[4];
		for (int z=0; z< result.length-1; z++) {
			for (int a=0; a<result.length-1; a++) {
				if(result[a][sortIndex] > result[a+1][sortIndex]) {
					temp = result[a];
					result[a] = result[a+1];
					result[a+1] = temp;
				}
			}
		}

		return result;
	}
}
