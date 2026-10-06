class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int n = tem.length;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i= 0; i<n; i++){

            while(!st.isEmpty() && tem[i] > tem[st.peek()]){
                int index = st.pop();
                res[index] = i - index;
            }

            st.push(i);
        }

        return res;
    }
}