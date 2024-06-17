class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] check = {"aya", "ye", "woo", "ma"};
        for(String s : babbling){
            for(String c : check){
                s=s.replace(c," ");
            }
            if(s.trim().length()==0) answer+=1;
        }
        return answer;
    }
}