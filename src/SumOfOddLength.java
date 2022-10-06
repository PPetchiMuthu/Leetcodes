public class SumOfOddLength {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int oddPosition = 1;
        while (oddPosition <= arr.length) {
            if (oddPosition == 1 || oddPosition == arr.length) for (int num : arr)
                sum = sum + num;
            else {
                for (int j = 0; j <= arr.length - oddPosition; j++)
                    for (int k = j; k < j + oddPosition; k++)
                        sum = sum + arr[k];
            }
            oddPosition += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfOddLength sumOfOddLength = new SumOfOddLength();
        System.out.println(sumOfOddLength.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }
}
