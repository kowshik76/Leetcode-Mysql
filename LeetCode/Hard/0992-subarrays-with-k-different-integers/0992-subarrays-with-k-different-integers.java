class Solution {
    public static int isDifferent(int[] arr,int k){
        if(k<0){
            return 0;
        }
        HashMap<Integer,Integer> hash=new HashMap<>();
        int l=0,r=0,count=0;
        while(r<arr.length){
            hash.put(arr[r],hash.getOrDefault(arr[r],0)+1);
            while(hash.size()>k){
                hash.put(arr[l],hash.get(arr[l])-1);
                if(hash.get(arr[l])==0){
                    hash.remove(arr[l]);
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return isDifferent(nums,k)-isDifferent(nums,k-1);
    }
}