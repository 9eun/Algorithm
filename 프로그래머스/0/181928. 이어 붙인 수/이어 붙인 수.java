class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String r1 = "";
        String r2 = "";
        for(int a : num_list){
            if(a%2==0){
                r2+=a;
            }
            else{
                r1+=a;
            }
        }
        int a1 = Integer.parseInt(r1);
        int a2 = Integer.parseInt(r2);
        answer = a1+a2;
        return answer;
    }
}