// Problem: Trapping Rainwater
// Platform: LeetCode
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int sum=0;

        while(i<j){
            if(height[i]<=height[j]){
                leftMax=Math.max(height[i],leftMax);
                sum+=leftMax-height[i];
                i++;
            }
            
            else{
                rightMax=Math.max(height[j],rightMax);
                sum+=rightMax-height[j];
                j--;
            }


        }

    return sum;
        
    }
}