class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean[] hasrow = new boolean[n];
        boolean[] hascol = new boolean[m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 0){
                    hasrow[i] = true;
                    hascol[j] = true;
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(hasrow[i] || hascol[j]){
                    mat[i][j] = 0;
                }
            }
        }

        
    }
}