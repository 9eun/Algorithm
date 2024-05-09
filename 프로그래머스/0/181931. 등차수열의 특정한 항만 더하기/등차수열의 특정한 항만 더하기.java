import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
//         int sum = d;
//         int res = a;
        
//         for(Boolean s : included){
//             if(s){
//                 answer+=res;
//             }
//             res+=d;
//         }
      

        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();    

    }
}