class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> stringMatch = new HashMap<String, List<String>>();
        List<List<String>> finalAns = new ArrayList<>();

        char[] sortedChars;
        String sortedStr;
        List<String> existedList;

        for (String str : strs) {
            sortedChars = str.toCharArray();
            Arrays.sort(sortedChars);
            sortedStr = new String(sortedChars);

            if (stringMatch.containsKey(sortedStr)) {
                existedList = stringMatch.get(sortedStr);
                existedList.add(str);
                stringMatch.replace(sortedStr, existedList);
            } else {
                existedList = new ArrayList<>();
                existedList.add(str);
                stringMatch.put(sortedStr, existedList);
            }
        }

        for (List<String> vals : stringMatch.values()) {
            finalAns.add(vals);
        }

        return finalAns;

    }
}
