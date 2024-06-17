import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int[][] answer;
        if(a>=b) {
            answer = new int[a][a];
            for(int i=0;i<a;i++){
                answer[i] = Arrays.copyOf(arr[i],a);
            }
        }
        else {
            answer = new int[b][b];
            for(int i=0;i<a;i++){
                answer[i] = Arrays.copyOf(arr[i],b);
            }
        }
        
    
        
        return answer;
    }
}