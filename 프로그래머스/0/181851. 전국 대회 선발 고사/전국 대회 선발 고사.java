import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] arr = new int[rank.length][2];
        for(int i=0;i<rank.length;i++){
            Arrays.fill(arr[i],101);    
        }        
        int a = 0;
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                arr[a][0]=rank[i];
                arr[a][1]=i;
                a++;
            }
        }
        Arrays.sort(arr,(o1,o2)->o1[0]-o2[0]);
        answer = arr[0][1]*10000+arr[1][1]*100+arr[2][1];
        return answer;
    }
}