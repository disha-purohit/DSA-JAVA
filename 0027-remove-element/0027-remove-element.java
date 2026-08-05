class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != val)
            k++;
        }
        int i =0;
        int j = n-1;
        while(i <= j){
            int temp = 0;
            if(nums[j] == val)
            j--;

            else if (nums[i] != val)
            i++;

            else 
            {
             temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp ;
            i++;
            j--;
            }
        }
        return k;
    }
}