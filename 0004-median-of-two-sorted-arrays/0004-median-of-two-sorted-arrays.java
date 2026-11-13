class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m)
        if(nums1[i] <= nums2[j]){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        else{
            arr[k] = nums2[j];
            k++;
            j++;
        }
         while (i < n) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        int mid = arr.length / 2;

        if (arr.length % 2 == 1) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
    }
}