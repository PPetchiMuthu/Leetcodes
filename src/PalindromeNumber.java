
// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. //Therefore it is not a palindrome.


// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int sum=0;
        int y=x;

        while(y>0){
            int rem = y%10;
            sum = sum*10+rem;
            y = y/10;
        }
        if(sum==x)
            return true;
        return false;

    }

    public static void main(String[] args) {
        PalindromeNumber num = new PalindromeNumber();
        System.out.println(num.isPalindrome(121));
    }
}