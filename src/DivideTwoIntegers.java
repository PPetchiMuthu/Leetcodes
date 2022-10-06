//Example 1:
//
//        Input: dividend = 10, divisor = 3
//        Output: 3
//        Explanation: 10/3 = 3.33333.. which is truncated to 3.
//        Example 2:
//
//        Input: dividend = 7, divisor = -3
//        Output: -2
//        Explanation: 7/-3 = -2.33333.. which is truncated to -2.

class DivideTwoIntegers{
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648&&divisor==-1)
            dividend = dividend+1;
        return (int)(dividend/divisor);
    }

    public static void main(String[] args) {
        DivideTwoIntegers div = new DivideTwoIntegers();
        System.out.println(div.divide(10,3));
    }
}