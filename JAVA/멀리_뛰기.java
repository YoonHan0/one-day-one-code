import java.util.List;
import java.util.ArrayList;

class Solution {
    public long solution(int n) {
        long[] dep = new long[n];

		if(n < 3) return n;

		dep[0] = 1;
		dep[1] = 2;

		for(int i=2; i<dep.length; i++) {
			dep[i] = (dep[i-1] + dep[i-2]) % 1234567;
		}
		return dep[dep.length-1];
    }
}