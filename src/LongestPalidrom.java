public class LongestPalidrom {
    public String longestPalindrome(String s) {
        for (int count = s.length(); count >= 1; count--) {
            for(int end = 0;end<=s.length()-count;end++){
                String str = s.substring(end,end+count);
                if(isPalidrome(str))
                    return str;
            }
        }
     return "";
    }
    private boolean isPalidrome(String str) {
       int start =0,end = str.length()-1;
       while(start<end){
           if(str.charAt(start)!=str.charAt(end))
               return false;
           start++;
           end--;
       }
        return true;
    }

    public static void main(String[] args) {
        LongestPalidrom longestPalidrom = new LongestPalidrom();
        String s =longestPalidrom.longestPalindrome("ababcde");
        System.out.println(s);
    }

}
