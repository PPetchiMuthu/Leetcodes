// Example 1:


// Input: mat = [[1,2],[3,4]], r = 1, c = 4
// Output: [[1,2,3,4]]


// Example 2:


// Input: mat = [[1,2],[3,4]], r = 2, c = 4
// Output: [[1,2],[3,4]]

import java.util.Arrays;

class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length*mat[0].length!=r*c)
            return mat;

        int[][] reshape = new int[r][c];

        for(int i=0;i<r*c;i++){
            reshape[i/c][i%c]=mat[i/mat[0].length][i%mat[0].length];
        }
        return reshape;
    }

    public static void main(String[] args) {
        ReshapeMatrix  reshape = new ReshapeMatrix();
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4 ;
        mat = reshape.matrixReshape(mat,r,c);
        System.out.println(Arrays.deepToString(mat));
    }
}