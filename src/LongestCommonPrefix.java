//Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String target = strs[0];

        for(String val : strs) {

            int len = target.length();

            if(len==0)
                return target;

            if(len>val.length())
                len = val.length();

            for (int i = 0; i < len; i++)
                if (val.charAt(i) != target.charAt(i)) {
                    target = val.substring(0, i);
                    break;
                }
            if(target.length()>val.length())
                target = val;
        }
        return target;
    }

    public static void main(String[] args) {
        String[]  strs = {"flower","flow","flight"};
        LongestCommonPrefix target = new LongestCommonPrefix();
        System.out.println(target.longestCommonPrefix(strs));
    }
}