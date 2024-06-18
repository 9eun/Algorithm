class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int m = total/num;
        int s = m-(num-1)/2;
        for(int i=0;i<num;i++){
            answer[i] = s++;
        }
        return answer;
    }
}