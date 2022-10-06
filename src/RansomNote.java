// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count= new int[128];

        for (char ch : magazine.toCharArray())
            ++count[ch];

        for (char ch : ransomNote.toCharArray())

            if (--count[ch] < 0)
                return false;
        return true;

    }

    public static void main(String[] args) {
        RansomNote note = new RansomNote();
        System.out.println(note.canConstruct("ab","aa"));
    }
}
