public class Leet2Code3 {
    public static void main(String[] args) {
        Leet2Code3 leet2Code3 = new Leet2Code3();
        leet2Code3.start();
    }

    private void start() {
        String str = "leet2code3";
        String emptyStr = "",dummy = "";
        for(int i=0 ;i<str.length();i++){
            if(str.charAt(i)<'9'&&str.charAt(i)>'0'){
                for(int j =0;j<str.charAt(i)-'0';j++)
                    emptyStr+=dummy;
            }
            else {
                emptyStr = emptyStr + str.charAt(i);
                dummy = emptyStr;
            }
        }
        System.out.println(emptyStr);
    }
}
