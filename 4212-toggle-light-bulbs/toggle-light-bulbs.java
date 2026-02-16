class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> li = new ArrayList<>();

        HashMap<Integer, Integer> hm= new HashMap<>();

        for(int i = 0; i<bulbs.size(); i++){
            hm.put(bulbs.get(i), hm.getOrDefault(bulbs.get(i), 0) + 1);
        }

        for(int i : hm.keySet()){
            if(hm.get(i) % 2 != 0){
                li.add(i);
            }
        }

        Collections.sort(li);
        return li;
    }
}