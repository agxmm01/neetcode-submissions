class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        for(int num : set) {
            if(!set.contains(num-1)) {
                // it is a new sequence and check for num + 1
                int currEle = num;
                int currLen = 1;
                while(set.contains(currEle + 1)) {
                    currEle += 1;
                    currLen += 1;
                }
                maxLen = Math.max(currLen, maxLen);
            }
        }
        return maxLen;
    }
}
