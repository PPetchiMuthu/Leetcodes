import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] newDigit = new int[digits.length+1];
        int temp =1;
        for(int i=digits.length-1;i>=0;i--)
        {
            temp = digits[i]+temp;
            digits[i]=temp%10;
            temp = temp/10;
        }
        if(temp!=0){
            int i=0;
            newDigit[i++]=temp;
            for(int copy:digits)
                newDigit[i++]=copy;
            return newDigit;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plus= new PlusOne();
        System.out.println(Arrays.toString(plus.plusOne(new int[]{9,9,9})));
//        int[] array = {1,2,3,4,5,6,3,2,5,3,4,5,3,5,3,5,3};
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int num:array)
//        map.put(num,map.getOrDefault(num,0)+1);
//        System.out.println(map);
    }
}
