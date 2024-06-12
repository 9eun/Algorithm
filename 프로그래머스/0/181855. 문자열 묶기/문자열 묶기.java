import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[10000];
        for(String s : strArr){
            count[s.length()]++;
        }
        answer = Arrays.stream(count).max().getAsInt();
        return answer;
    }
}