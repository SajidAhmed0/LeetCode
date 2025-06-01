class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsStat = new HashMap<>();
        int[] kVals = new int[k];
        Queue<Integer> minHeap = new PriorityQueue<Integer>(
                (a, b) -> numsStat.get(a) - numsStat.get(b));

        for (int num : nums) {
            if (numsStat.containsKey(num)) {
                numsStat.replace(num, numsStat.get(num) + 1);
            } else {
                numsStat.put(num, 1);
            }
        }

        for (int num : numsStat.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            kVals[i] = minHeap.poll();
        }

        return kVals;
    }
}