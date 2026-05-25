class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;

        int start = 0;
        int end = s.length() - 1;

        while(start <= end) {
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(currStart)) start += 1;
            else if(!Character.isLetterOrDigit(currEnd)) end -= 1;
            else {
                if(Character.toLowerCase(currStart) != Character.toLowerCase(currEnd)) return false;
                start += 1;
                end -= 1;
            }
        }
        return true;
    }
}
