package JAVA;

/* 피자 나눠먹기(3) */
class Solution {
    public int solution(int slice, int n) {
        
        int result = 1;
		
		while(true) {
			if( (result * slice) / n > 0 ) break;
			result++;
		}
        return result;
    }
    
}
