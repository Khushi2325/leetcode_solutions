class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int s = (int) (Math.log10(nums[i]) + 1);
            int[] arr = new int[s];
            int index = 0;
            while(nums[i] > 0){
                arr[index++] = nums[i] % 10;
                nums[i] /= 10;
            }
            for(int j = s - 1; j>= 0; j--){
                list.add(arr[j]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}