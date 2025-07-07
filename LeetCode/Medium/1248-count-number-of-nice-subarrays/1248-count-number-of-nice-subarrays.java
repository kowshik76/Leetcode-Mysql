class Solution {
    public static int isNice(int[] arr,int k){
        if(k<0){
            return 0;
        }
        int l=0,r=0,sum=0,count=0;
        while(r<arr.length){
            sum+=arr[r]%2;
            while(sum>k){
                sum-=arr[l]%2;
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return isNice(nums,k)-isNice(nums,k-1);
    }
}