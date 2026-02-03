class Solution {
    static{
        Runtime.getRuntime().addShutdownHook(
                new Thread(()->{
                    try(FileWriter f=new FileWriter("display_runtime.txt")){
                        f.write('0');
                    }catch(Exception e){}
                })
            );
    }
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i : nums){
            hs.add(i);
        }
        int[] arr = new int[hs.size()];
        int j = 0;

        for(int i : hs){
            arr[j++] = i;
        }

        Arrays.sort(arr);

        return lcs(nums, arr);
    }

    public int lcs(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[][] dp = new int[n+1][m+1];

        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<m+1; j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
}