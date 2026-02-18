class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        List<Boolean> li = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }

        for(int i = 0; i<candies.length; i++){
            if(candies[i] + e >= max){
                li.add(true);
            }else{
                li.add(false);
            }
        }

        return li;
    }
}