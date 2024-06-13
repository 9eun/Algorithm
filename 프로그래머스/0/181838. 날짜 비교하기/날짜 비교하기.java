import java.util.*;

class Solution {

    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        answer = Arrays.compare(date2,date1)>0?1:0;
        return answer;
    }
}