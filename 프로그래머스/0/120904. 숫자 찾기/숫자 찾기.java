class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = num+"";
        int count = 1;
        for(char c : s.toCharArray()){
            System.out.println(c);
            if(c==Character.forDigit(k,10)){
                answer = count;
                break;
            }
            else count++;
        }
        return answer;
    }
}