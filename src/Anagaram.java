import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagaram {
    public static void main(String[] args) {
        String str = "ababa";
        Anagaram anagaram = new Anagaram();
        anagaram.findSolution(str);
    }
    private void findSolution(String str) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() ; i++) {
            String dummy = "";
            for (int j = i; j < str.length(); j++) {
                dummy = dummy + str.charAt(j);
                char[] ch = dummy.toCharArray();
                Arrays.sort(ch);
                dummy = String.valueOf(ch);
                if (map.containsKey(dummy))
                    map.put(dummy, map.get(dummy) + 1);
                else
                    map.put(dummy, 0);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            for(int i=1;i<=entry.getValue();i++)
               count += i;
        }
        System.out.println(count);
    }
}
