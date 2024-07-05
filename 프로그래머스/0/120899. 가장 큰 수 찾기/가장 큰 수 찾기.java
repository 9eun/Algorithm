import java.util.*;
class Solution {
    public int[] solution(int[] array) {        
        int index = 0;
        int max = Arrays.stream(array).max().getAsInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==max) index = i;
        }
        int[] answer = {max, index};
        return answer;
    }
}