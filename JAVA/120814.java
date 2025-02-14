package JAVA;

/** 피자 나눠먹기(1) */
class Solution {
    public int solution(int n) {
        return n/7 + (n%7 > 0 ? 1 : 0);
    }
}