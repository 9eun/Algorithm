import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String>list = new ArrayList<>();
        String a = "";
        for(char c : my_string.toCharArray()){
            if(c==' '){
                list.add(a);
                a = "";
            }
            else a+=c;
        }
        list.add(a);
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}