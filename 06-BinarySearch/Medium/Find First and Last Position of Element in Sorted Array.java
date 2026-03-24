class Solution {
    public int[] searchRange(int[] nums, int t) {
        int a=binarysearch1(nums,t);
        int b=binarysearch2(nums,t);
        return new int[]{a,b};

        
    }


    public int binarysearch1(int [] nums,int t){
        
        int s=0;
        int e=nums.length-1;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(t==nums[mid]){
                ans=mid;
                e=mid-1;
            }
            else if(t>nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        return ans;


    }


    public int binarysearch2(int [] nums,int t){
        int s=0;
        int e=nums.length-1;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(t==nums[mid]){
                ans=mid;
                s=mid+1;
            }
            else if(t>nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;


    }






}