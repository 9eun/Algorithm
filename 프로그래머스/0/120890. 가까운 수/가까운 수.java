class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 999;
        for(int i : array){
            if(temp>Math.abs(n-i)){
                temp =Math.abs(n-i);
                answer = i;
            }
            else if(temp==Math.abs(n-i)){
                answer = answer>i?i:answer;
            }
        }
        return answer;
    }
}