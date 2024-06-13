class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int a1 = date1[0];
        int b1 = date1[1];
        int c1 = date1[2];
        int a2 = date2[0];
        int b2 = date2[1];
        int c2 = date2[2];
        if(a1<a2) answer = 1;
        else if(a1>a2) answer = 0;
        else{
            if(b1<b2) answer = 1;
            else if(b1>b2) answer = 0;
            else{
                if(c1<c2) answer = 1;
                else answer = 0;
            }
        }
            
        return answer;
    }
}