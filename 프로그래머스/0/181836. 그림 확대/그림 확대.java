import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String>list = new ArrayList<>();
        for(String s : picture){
            String a = "";
            
            for(char c : s.toCharArray()){
                a+=String.valueOf(c).repeat(k);
            }
            for (int j = 0; j < k; j++) {
                list.add(a);
            }
            
        }
        String[] answer = list.toArray(String[]::new);
        return answer;
    }
}