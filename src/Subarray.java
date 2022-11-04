public class Subarray {
    public static void main(String[] args) {
        int[] array = {5,4,2,3,-1,-1,3,-1};
        Subarray subarray = new Subarray();
        System.out.println(subarray.getSolution(array));
    }
    private int getSolution(int[] array) {
        for(int count = array.length;count>=0;count--){
            int sum = 0;
            for(int i=0;i<count;i++)
                sum +=array[i];
            if(sum==0)
                return count;
            for(int end = count;end<array.length;end++){
                sum += array[end] - array[end-count];
                if(sum==0)
                    return count;
            }
        }
        int n = Integer.MAX_VALUE;
        return -1;
    }
}
