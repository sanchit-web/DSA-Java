class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal==0){
            return atMost(nums,goal);
        }
        return atMost(nums,goal)-atMost(nums,goal-1);

        
    }

   

    public int atMost(int [] nums,int k){
        int sum=0;
        int c=0;
        int left=0;

        for(int right=0;right<nums.length;right++){

          sum+=nums[right];

        while(sum>k){
            sum-=nums[left];
            left++;
        }
        
        c+=right-left+1;
        }

    return c;   
    }
}