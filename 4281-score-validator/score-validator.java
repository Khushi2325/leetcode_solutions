class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        int[] ans = new int[2];

        for(int i  = 0; i<events.length; i++){
            if(events[i].equals("W")){
                counter++;
                if(counter == 10){
                    break;
                }
            }else if(events[i].equals("WD")){
                score+=1;
            }else if(events[i].equals("NB")){
                score++;
            }else{
                score += Integer.parseInt(events[i]);
            }
        }

        ans[0] = score;
        ans[1] = counter;

        return ans;
    }
}