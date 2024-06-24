import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];      
        int i = 0;
        for(String s : quiz){
            String[] w = s.split(" ");
            int X = Integer.parseInt(w[0]);
            int Y = Integer.parseInt(w[2]);
            int Z = Integer.parseInt(w[4]);
            int res = 0;
            String a = w[1];
            if(a.equals("+")) res = X+Y;
            else if(a.equals("-")) res = X-Y;
            else if(a.equals("*")) res = X*Y;
            else if(a.equals("/")) res = X/Y;
            if(res==Z)answer[i++]="O";
            else answer[i++]="X";
        }
        return answer;
    }
}