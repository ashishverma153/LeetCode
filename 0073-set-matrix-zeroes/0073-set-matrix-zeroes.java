class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrowZero = false;
        boolean firstcolZero = false;

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstrowZero = true;
                break;
            }
        }

        for(int j=0;j<matrix.length;j++){
            if(matrix[j][0]==0){
                firstcolZero = true;
                break;
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
                }
            }

        if(firstrowZero){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }

        if(firstcolZero){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}