import java.util.HashMap;
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int noOfOdds=0;
        int count=0;
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0 ){
             noOfOdds+=1;
            }

            if(map.containsKey(noOfOdds-k)){
                count+=map.get(noOfOdds-k);
            }
            map.put(noOfOdds,map.getOrDefault(noOfOdds,0)+1);


        }
    return count;
        
    }
}