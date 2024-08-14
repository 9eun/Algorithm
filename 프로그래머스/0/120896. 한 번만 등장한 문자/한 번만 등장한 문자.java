import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        for(String c : arr){
            int cnt = 0;
            for(String d : arr){
                if(c.equals(d)){
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=c;
            }
        }
        return answer;
    }
}