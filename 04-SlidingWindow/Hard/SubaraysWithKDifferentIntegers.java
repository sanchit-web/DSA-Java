import java.util.HashMap;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k==0){
            return atMost(nums,k);
        }
        return atMost(nums,k)-atMost(nums,k-1);
       
    }

    public int atMost(int [] nums, int k){
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int  count=0;

        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k){
                int c=map.get(nums[left]);
                if(c==1){
                    map.remove(nums[left]);
                }
                else{
                map.put(nums[left],c-1);
                }
                left++;
            }

            if(map.size()<=k){
                count+=right-left+1;

            }
        }
    return count;    
    }
}