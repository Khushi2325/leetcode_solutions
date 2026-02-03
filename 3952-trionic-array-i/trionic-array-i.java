class Solution {
    public boolean isTrionic(int[] arr) {
        int n= arr.length;

        if(n < 3) return false;

        for(int p = 1; p<n-1; p++){
            for(int q = p+1; q < n-1; q++){
                boolean inc1 = true;

                for(int i = 0; i<p; i++){
                    if(arr[i] >= arr[i+1]){
                        inc1 = false;
                        break;
                    }
                }

                if(!inc1) continue;

                boolean dec = true;

                for(int i = p; i<q; i++){
                    if(arr[i] <= arr[i+1]){
                        dec = false;
                        break;
                    }
                }

                if(!dec) continue;

                boolean inc2 = true;

                for(int i = q; i<n-1; i++){
                    if(arr[i] >= arr[i+1]){
                        inc2 = false;
                        break;
                    }
                }

                if(inc2) return true;
            }
        }

        return false;
    }
}