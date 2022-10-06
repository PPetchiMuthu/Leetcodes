//        Example 1:
//
//        Input: x = 123
//        Output: 321
//        Example 2:
//
//        Input: x = -123
//        Output: -321
//        Example 3:
//
//        Input: x = 120
//        Output: 21


class ReverseInteger {
    public int reverse(int x) {
            boolean out = true;
            if(x<0){
                x*=-1;
                out = false;
            }
            int reverse_x = 0;
            while(x>0){
                int last_digit = x%10;
                if( reverse_x<(Integer.MIN_VALUE/10) ||  reverse_x>(Integer.MAX_VALUE/10)){
                    return 0;
                }
                reverse_x =reverse_x*10+last_digit;
                x=x/10;
            }

            if(out)
                return reverse_x;
            else
                return reverse_x*-1;
    }

    public static void main(String[] args) {
        ReverseInteger rev = new ReverseInteger();
        System.out.println(rev.reverse(-123));
    }
}
