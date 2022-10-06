//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true

//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false

import java.util.Arrays;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram s = new ValidAnagram();
        System.out.println(s.isAnagram("anagrvram", "nagavrram"));
    }
}
