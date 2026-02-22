// Problem: Remove Element
// Platform: LeetCode
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }


        }
    return i;
        
    }
}