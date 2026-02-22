class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i<words.length; i++){
            if(words[i].length() >= k){
                String sub = words[i].substring(0,k);
                hm.put(sub, hm.getOrDefault(sub, 0) + 1);
            }
        }

        int cnt = 0;

        for(int i : hm.values()){
            if(i >= 2){
                cnt++;
            }
        }

        return cnt;
    }
}