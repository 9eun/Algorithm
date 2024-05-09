class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum = d;
        int res = a;
        
        for(Boolean s : included){
            if(s){
                answer+=res;
            }
            res+=d;
        }
        return answer;
    }
}