class Solution {
    public boolean isAnagram(String s, String t) {

        int arr[] = new int[26];

        if (s.length() != t.length())
            return false;
        char c_s;
        int ind_s;
        int ind_t;

        for (int i = 0; i < s.length(); i++) {

            ind_s = (int) s.charAt(i) - 'a';
            ind_t = (int) t.charAt(i) - 'a';

            arr[ind_s] = arr[ind_s] + 1;
            arr[ind_t] = arr[ind_t] - 1;
        }

        for (int i : arr) {
            if (i != 0)
                return false;
        }
        return true;
    }
}