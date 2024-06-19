class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            String s = a+"";
            answer += s.chars().filter(c -> c == '7').count();
        }
        return answer;
    }
}