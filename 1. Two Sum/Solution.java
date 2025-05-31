class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

        int rem;
        for (int i = 0; i < nums.length; i++) {
            rem = target - nums[i];
            if (values.containsKey(rem)) {
                return new int[] { values.get(rem), i };
            }
            values.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}