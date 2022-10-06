// Example 1:

// Input: s = "leetcode"
// Output: 0
// Example 2:

// Input: s = "loveleetcode"
// Output: 2
// Example 3:

// Input: s = "aabb"
// Output: -1

class FirstUniqueCharacter{
    public int firstUniqChar(String s) {

        int[] map = new int[26];

        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i) - 'a';
            map[ascii] = map[ascii] + 1;
        }

        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i) - 'a';
            if(map[ascii] == 1)
                return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        FirstUniqueCharacter first = new FirstUniqueCharacter();
        System.out.println(first.firstUniqChar("leetcode"));
    }
}