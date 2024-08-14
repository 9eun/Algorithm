import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        System.out.println(list);
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}