class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = n+"";
        for(char c : s.toCharArray()){
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}