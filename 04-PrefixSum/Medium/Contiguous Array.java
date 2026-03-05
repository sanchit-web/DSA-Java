import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        int prefixSum=0;
        map.put(0,-1);



        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];

            if(map.containsKey(prefixSum-0)){
                int len=i-map.get(prefixSum);
                maxLen=Math.max(maxLen,len);
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }


        }
    return maxLen;
        
    }
}