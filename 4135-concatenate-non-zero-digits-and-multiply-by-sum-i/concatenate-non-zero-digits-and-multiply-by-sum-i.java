class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();

        int temp = n;

        while(temp > 0){
            int d = temp % 10;
            if(d != 0){
                sb.append(d);
            }
            temp /= 10;
        }

        if(sb.length() == 0) return 0;

        sb.reverse();
        int x = Integer.parseInt(sb.toString());

        long sum = 0;
        int t= x;

        while(t > 0){
            sum += t % 10;
            t /= 10;
        }

        return (long)x * sum;
    }
}