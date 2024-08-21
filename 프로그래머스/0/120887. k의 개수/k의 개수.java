import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = k+"";
        for(int l=i;l<=j;l++){
            String str1 = l+"";
            if(str1.contains(str)){
                String[] arr = str1.split("");
                for(String a : arr){
                    if(a.equals(str)) answer++;
                }
            }
        }
        return answer;
    }
}