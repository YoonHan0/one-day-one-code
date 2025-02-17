package JAVA;

import java.util.Scanner;

/* [PCCE 기출문제] 3번 / 수 나누기 */
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<number; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
