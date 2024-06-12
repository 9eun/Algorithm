import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr)list.add(i);
        for(int d : delete_list){
            list.remove(Integer.valueOf(d));
        }
        System.out.print(list);
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}