class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] x : queries){
            for(int i=x[0];i<=x[1];i++) arr[i]+=1;
        }
        return arr;
    }
}