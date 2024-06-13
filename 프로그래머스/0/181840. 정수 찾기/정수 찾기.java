import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        if(Arrays.stream(num_list).anyMatch(i->i==n))answer =1;
        return answer;
    }
}