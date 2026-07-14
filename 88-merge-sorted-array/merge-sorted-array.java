class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fp=m-1;
        int sp=n-1;
        int tp=m+n-1;
        while(fp>=0 && sp>=0){
            if(nums1[fp]>nums2[sp]){
                nums1[tp]=nums1[fp];
                fp--;
            }
            else{
                nums1[tp]=nums2[sp];
                sp--;
            }
            tp--;
        }

        // while(fp >= 0){
        //     nums1[tp--] = nums1[fp--];
        // }

        while(sp >= 0){
            nums1[tp--] = nums2[sp--];
        }
    }
}