class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = -1;
        int left = 0, right = n-1;
        while(left < right) {
            int width = right - left;
            int area = Math.min(heights[left], heights[right]) * width;
            maxArea = Math.max(area, maxArea);

            if(heights[left] < heights[right]) left += 1;
            else right -= 1;
        }
        return maxArea;
    }
}
