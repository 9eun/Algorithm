import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int a = n;
        while (a!=1){
            if(a%2==0) {
                list.add(a);
                a/=2;
            }
            else{
                list.add(a);
                a=3*a+1;
            }
        }
        list.add(a);
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i ++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}