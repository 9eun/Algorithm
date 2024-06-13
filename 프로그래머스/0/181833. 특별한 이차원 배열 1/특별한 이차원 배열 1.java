class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int a = 0;
        int b = 0;
        for(int i=0;i<n;i++){
            answer[a][b]=1;
            a+=1;
            b+=1;
        }
        return answer;
    }
}