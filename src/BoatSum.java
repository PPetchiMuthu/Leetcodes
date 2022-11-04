import java.util.Arrays;

public class BoatSum {
    public static void main(String[] args) {
        int[] array = {2,2,3,3,4,4,6,6};
        Arrays.sort(array);
        int count = 0;
        int endIndex = array.length - 1;
        int startIndex = 0;
        while (startIndex < endIndex) {
            if (array[endIndex] + array[startIndex] <= 10) {
                array[startIndex] = array[endIndex] + array[startIndex];
                array[endIndex] = 0;
                endIndex--;
                startIndex++;
            } else {
                endIndex--;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int num : array)
            if (num != 0) count++;
        System.out.println(count);
    }
}
