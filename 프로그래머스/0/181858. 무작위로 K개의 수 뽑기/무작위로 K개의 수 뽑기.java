import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : arr){
            if(!set.contains(i)){
                set.add(i);
                answer[count] = i;
                count++;    
            }
            
            if(count==k)break;
        }       
        for(int i=count;i<k;i++){
            answer[i] = -1;
        }
        return answer;
    }
}