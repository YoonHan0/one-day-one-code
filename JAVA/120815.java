package JAVA;

/** 피자 나눠먹기(2) */
class Solution {
    public int solution(int n) {
        int result = 1;
		while(true) {
			if( (result*6) % n == 0) break;
			result++;
		}
        return result;
    }
}
