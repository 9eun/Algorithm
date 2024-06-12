class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int a = arr.length;
        if(a%2==1){
            for(int i=0;i<a;i+=2)arr[i]+=n;
        }
        else{
            for(int i=1;i<a;i+=2)arr[i]+=n;
        }
        answer = arr;
        return answer;
    }
}