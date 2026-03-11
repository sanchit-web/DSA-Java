import java.util.HashMap;
class Solution {
    public int minSubarray(int[] nums, int p) {
        long total=0;
        for(int num:nums){
            total+=num;
            
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=(int)(total%p);
        if(k==0){
            return 0;
        }
        long prefixSum=0;
        int minLen=nums.length;
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];

            int remainder=(int)(prefixSum%p);
            int target=(remainder-k+p)%p;

            if(map.containsKey(target)){
                int len=i-map.get(target);
                minLen=Math.min(len,minLen);

            }

            map.put(remainder,i);
        }
    if(minLen==nums.length){
        return -1;
    }
    return minLen;
        
    }
}