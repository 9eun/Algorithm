import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        Integer[] arr = Arrays.stream(indices).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        for(int i : arr){
            sb.deleteCharAt(i);    
        }
        
        return sb.toString();
    }
}