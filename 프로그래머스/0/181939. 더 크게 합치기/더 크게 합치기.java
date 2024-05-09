class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = a + "";
        if(Integer.parseInt(s+b)<=Integer.parseInt(b+s)){
            answer = Integer.parseInt(b+s);
        }
        else{
            answer = Integer.parseInt(s+b);
        }
        return answer;
    }
}