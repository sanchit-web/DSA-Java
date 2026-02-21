package Easy;
 // Problem: Valid Palindrome
// Platform: LeetCode
// Pattern: Two Pointers
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1) 

class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(!(Character.isLetterOrDigit(s.charAt(i)))){
                i++;
                continue;
            }
            if(!(Character.isLetterOrDigit(s.charAt(j)))){
                j--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
    return true;    
    }
}
    

