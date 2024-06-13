class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c : myString.toCharArray()){
            if((int)c <108) answer+='l';
            else answer+=c;
        }
        return answer;
    }
}