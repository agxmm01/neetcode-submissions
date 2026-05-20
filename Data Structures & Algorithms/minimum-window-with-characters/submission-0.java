class Solution {
    boolean contains(int[] mapS, int[] mapT) {
        for(int i = 0 ; i < 256; i++) {
            if(mapS[i] < mapT[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len2 > len1) return "";
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for(char ch : t.toCharArray()) mapT[ch] += 1;

        int left = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        for(int right = 0; right < len1; right++) {
            char ch = s.charAt(right);
            mapS[ch] += 1;

            while(contains(mapS,mapT)) {
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                mapS[s.charAt(left++)] -= 1;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}