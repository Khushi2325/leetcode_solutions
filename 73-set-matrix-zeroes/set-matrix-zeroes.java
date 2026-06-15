class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int max = -999999;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 0){
                    for(int k = 0; k<n; k++){
                        if(mat[k][j] != 0){
                            mat[k][j] = max;
                        }
                    }

                    for(int k = 0; k<m; k++){
                        if(mat[i][k] != 0){
                            mat[i][k] = max;
                        }
                    }
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == max){
                    mat[i][j] = 0;
                }
            }
        }


    }
}