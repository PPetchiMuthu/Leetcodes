//Example 1:
//
//        Input: n = 27
//        Output: true
//        Explanation: 27

//        Example 2:
//
//        Input: n = 0
//        Output: false
//        Explanation: There is no x where 3x = 0.

//        Example 3:
//
//        Input: n = -1
//        Output: false
//        Explanation: There is no x where 3x = (-1).

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while(n!=0 && n%3 == 0)
            n/=3;
        return n==1;
    }

    public static void main(String[] args) {
        PowerOfThree power = new PowerOfThree();
        System.out.println(power.isPowerOfThree(243));
    }
}

