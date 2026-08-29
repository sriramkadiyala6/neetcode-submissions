class Solution {
    public int maxArea(int[] heights) {
        int area = Integer.MIN_VALUE;
        int i = 0, j = heights.length-1;

        while(i < j){
            if((j-i)*(Math.min(heights[i], heights[j])) > area){
                area = (j-i)*Math.min(heights[i], heights[j]);
                if(heights[i] < heights[j]) i++;
                else j--;
            }
            else{
                if(heights[i] < heights[j]) i++;
                else j--;
            }
        }
        return area;
    }
}
