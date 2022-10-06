public class SpecialPositionInBinarySearch {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int row = 0; row < mat.length; row++)
            for (int column = 0; column < mat[row].length; column++) {
                boolean condition = true;
                if (mat[row][column] == 1) {
                    for (int dum = 0; dum < mat.length; dum++)
                        if (dum != row && mat[dum][column] == 1) {
                            condition = false;
                            break;
                        }
                    for (int dum = 0; dum < mat[row].length; dum++)
                        if (dum != column && mat[row][dum] == 1) {
                            condition = false;
                            break;
                        }
                    if (condition) count++;
                }
            }
        return count;
    }

}
