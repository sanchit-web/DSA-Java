// Problem: Maximum Average Subarray 1
// Platform: LeetCode
// Pattern: Two Pointers
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            if(right-left+1==k){
                maxSum=Math.max(sum,maxSum);

                sum-=nums[left];
                left++;
            }
        }
    return (double)maxSum/k;    
    }
}