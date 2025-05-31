class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> sStats = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tStats = new HashMap<Character, Integer>();

        if (s.length() != t.length())
            return false;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (sStats.containsKey(c)) {
                int count = sStats.get(c);
                sStats.replace(c, count + 1);
            } else {
                sStats.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            if (tStats.containsKey(c)) {
                int count = tStats.get(c);
                tStats.replace(c, count + 1);
            } else {
                tStats.put(c, 1);
            }
        }

        return sStats.equals(tStats);
    }
}
