// Problem: Move Zeroes
// Platform: LeetCode
// Pattern: Two Pointers
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;  // position to place next non-zero

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {

                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }
}
