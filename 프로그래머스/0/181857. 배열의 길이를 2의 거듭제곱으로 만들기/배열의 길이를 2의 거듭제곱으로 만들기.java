class Solution {
    public int[] solution(int[] arr) {
        int a = arr.length;
        int k = 1;
        while(k<a) k*=2;
        int[] answer = new int[k];
        for(int i=0;i<a;i++)answer[i]=arr[i];
        return answer;
    }
}