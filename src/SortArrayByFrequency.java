import java.util.*;

public class SortArrayByFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            return (map.get(a).equals(map.get(b)) ? b - a : map.get(a) - map.get(b));
        });
        System.out.println(list);
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByFrequency sortArrayByFrequency = new SortArrayByFrequency();
        sortArrayByFrequency.frequencySort(new int[]{0,2,3,3,4,2,3,4,2,4,4});
    }
}
