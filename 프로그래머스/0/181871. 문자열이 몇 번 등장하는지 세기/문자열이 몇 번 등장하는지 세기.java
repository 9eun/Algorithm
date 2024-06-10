class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int a = pat.length();
        for(int i=0;i<myString.length()-a+1;i++){
            if(myString.substring(i,i+a).equals(pat))answer+=1;
        }
        return answer;
    }
}