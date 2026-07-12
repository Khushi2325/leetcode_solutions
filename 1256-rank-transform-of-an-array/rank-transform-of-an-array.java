class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] temp = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> mp = new HashMap<>();
        int r = 1;

        for(int i = 0; i<n; i++){
            if(!mp.containsKey(temp[i])){
                mp.put(temp[i], r);
                r++;
            }
                
        }

        for(int i= 0; i<n; i++){
            ans[i] = mp.get(arr[i]);
        }

        return ans;
    }
}