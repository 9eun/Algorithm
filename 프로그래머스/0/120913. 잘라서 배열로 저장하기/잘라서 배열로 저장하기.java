class Solution {
    public String[] solution(String my_str, int n) {
        int a = (my_str.length()+n-1)/n;
        String[] answer = new String[a];
        int cnt = 0;
        String temp = "";
        int b = 0;
        for(char c : my_str.toCharArray()){
            if(cnt==n){
                answer[b] = temp;
                temp = "";
                cnt = 0;
                b++;
            }
            temp += c;
            cnt++;
        }
        answer[b] = temp;
        return answer;
    }
}