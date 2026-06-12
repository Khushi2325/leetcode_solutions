class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = n-1;
        int q = m-1;

        int k = n+m-1;

        while(p >= 0 && q >= 0){
            if(nums1[q] > nums2[p]){
                nums1[k--] = nums1[q--];
            }else{
                nums1[k--] = nums2[p--];
            }
        }

        while(q >= 0){
            nums1[k--] = nums1[q--];
        }

        while(p >= 0){
            nums1[k--] = nums2[p--];
        }

    }
}