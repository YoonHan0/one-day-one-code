package JAVA;

/** 카드 뭉치 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int x = 0;
        int y = 0;

        for(int i=0; i<goal.length; i++) {
            String goalChar = goal[i];

            if(x < cards1.length && goalChar.equals(cards1[x])) {
                x++;
            }
            else if(y < cards2.length && goalChar.equals(cards2[y])) {
                y++;
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}