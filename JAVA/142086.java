package JAVA;

/* 가장 가까운 같은 글자 */
class Solution {
    public int[] solution(String s) {
        String reverseS = new StringBuilder(s).reverse().toString();
        String[] list = reverseS.split("");
        int[] result = new int[list.length];

        for(int i=0; i<list.length; i++) {
            String text = list[i];
            int cnt = 1;
            if(i == list.length - 1) {
                result[i] = -1;
                break;
            }
            for(int j=i+1; j<result.length; j++) {
                String nextText = list[j];
                if(text.equals(nextText)) {
                    result[i] = cnt;
                    break;
                }
                else if(j == result.length - 1) {
                    result[i] = -1;
                }
                else {
                    cnt++;
                }
            }
        }

        return reserveFuc(result);
    }
    
    public int[] reserveFuc(int[] list) {
        int left = 0;
        int right = list.length - 1;

        while(left < right) {
            int temp = list[left];
            list[left] = list[right];
            list[right] = temp;

            left++;
            right--;
        }
        return list;
    }
}