import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String>list = new ArrayList<>();
        for(String s : picture){
            String a = "";
            
            for(char c : s.toCharArray()){
                for(int i=0;i<k;i++){
                    a+=c;
                }
            }
            for(int i=0;i<k;i++){
                String b = "";
                b+=a;
                list.add(b);
            }
            
        }
        String[] answer = list.toArray(String[]::new);
        return answer;
    }
}