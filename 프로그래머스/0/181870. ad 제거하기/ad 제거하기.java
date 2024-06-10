import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String>list = new ArrayList<>();
        for(String s : strArr){
            if(!s.contains("ad"))list.add(s);
        }
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}