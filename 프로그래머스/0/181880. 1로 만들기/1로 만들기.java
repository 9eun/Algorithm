class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i : num_list){
            int num = i;
            while (true){
                if(num==1) break;
                if(num%2==0) {
                    num = num/2;
                    answer+=1;
                }
                else {
                    num = (num-1)/2;
                    answer+=1;
                }
            }
        }
        return answer;
    }
}