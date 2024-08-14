class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = (order+"").split("");
        for(String s : arr){
            if((Integer.parseInt(s)%3==0)&&(Integer.parseInt(s)!=0)) answer++;
        }
        return answer;
    }
}