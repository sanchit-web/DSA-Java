// Problem: Sum of Squares
// Platform: LeetCode
// Pattern: Two Pointers
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        

        while(i<=j){
            long ans= i*i+j*j;

            if(ans==c){
                return true;
            }

            else if(ans<c){
                i++;
            }

            else{
                j--;
            }
        }

    return false;    
    }
}