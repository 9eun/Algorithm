class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int t1 = Integer.parseInt(""+a+b);
        int t2 = 2*a*b;
        answer = (t1>=t2) ? t1 : t2;
        return answer;
    }
}