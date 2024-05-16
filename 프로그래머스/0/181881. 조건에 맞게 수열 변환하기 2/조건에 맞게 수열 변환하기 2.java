import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        while (true){
            int[] arr2 = Arrays.copyOfRange(arr,0,arr.length);
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0) arr[i] = arr[i]/2;
                else if(arr[i]<50 && arr[i]%2==1) arr[i] = arr[i]*2+1;
            }
            if(Arrays.equals(arr,arr2))break;
            cnt+=1;
        }
        
        answer = cnt;
        return answer;
    }
}