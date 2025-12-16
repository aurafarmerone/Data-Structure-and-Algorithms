class diagonalSum {

     public static void main(String args[]){
        int mat[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum is:" + dSum(mat));

    }

    public static int dSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0; i<mat.length ; i++){
            for(int j=0; j<mat[0].length; j++){
                if(i==j){
                    sum += mat[i][j] ; 
                }
                else if((i+j) == n-1){
                    sum += mat[i][j] ;
                }
            }
        }
        return sum;
    }

    public int diagonalSumOptimized(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i=0; i<mat.length ; i++){
                sum += mat[i][i]; // i==j case
                if(i != n-i-1){  // avoid duplicate center add case
                    sum += mat[i][n-i-1] ; // i+j = n-1 ===> j = n-i-1 
                }
        }
        return sum;
    }
}
   
