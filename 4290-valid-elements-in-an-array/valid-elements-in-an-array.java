class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        List<Integer> list = new ArrayList<>();
        if(n==1){
            list.add(nums[0]);
            return list;
        }
        for(int i=0;i<n;i++){
            if(i==0) left[0]=0;
            else left[i]=Math.max(nums[i-1],left[i-1]);
            int j = n-i-1;
            if(n-1==j) right[j]=0;
            else right[j]=Math.max(nums[j+1],right[j+1]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>left[i]||nums[i]>right[i]||i==0||i==n-1) list.add(nums[i]);
        }
        return list;
    }
}