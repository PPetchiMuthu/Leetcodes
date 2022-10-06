// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]


import java.util.Arrays;

class RotateImage {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++)
            for(int j=0;j<matrix[i].length;j++){
                int tem = matrix[i][j];
                matrix[i][j]=matrix[matrix[i].length-1-i][j];
                matrix[matrix[i].length-1-i][j]=tem;
            }
        for(int i=0;i<matrix.length;i++)
            for(int j=i;j<matrix[i].length;j++){
                int tem = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
    }

    public static void main(String[] args) {
        RotateImage rot = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rot.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
