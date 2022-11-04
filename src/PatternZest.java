public class PatternZest {
    public static void main(String[] args) {
        PatternZest patternZest = new PatternZest();
        findPattern(3);
    }

    private static void findPattern(int num) {
        System.out.println(num);
        int space = 30;
        for (int i = 1; i <= num ; i++) {
            for (int spa = 0; spa < space; spa++)
                System.out.print(" ");
            for(int j =1;j<i*2;j++) {
//                int min =Math.max(Math.max(i-num+1,j-num+1),Math.max(num+1-i,num+1-j));
                int min = Math.min(i,j);
                System.out.print(min+" ");
//                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
            space -=2;
        }

    }
}
