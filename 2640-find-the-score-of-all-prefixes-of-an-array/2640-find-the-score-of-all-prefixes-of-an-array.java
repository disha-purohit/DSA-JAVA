class Solution {
    public long[] findPrefixScore(int[] nums) {
        long [] ans = new long[nums.length];
        int max_no = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            max_no = Math.max( max_no ,nums[i]);
            ans[i] = (long) nums[i] + max_no;
        }
        for(int i = 1 ; i< ans.length ;i++){
            ans[i] = ans[i] +ans[i-1];
        }
        return ans;
    }
}