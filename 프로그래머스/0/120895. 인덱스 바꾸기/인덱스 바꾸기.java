class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String a = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = a;
        for(String c : arr) answer+=c;
        return answer;
    }
}