// Example 1:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// Example 2:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target)
                    return true;
                if(matrix[i][j]>target)
                    return false;
            }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix search = new Search2DMatrix();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(search.searchMatrix(matrix,target));
    }
}