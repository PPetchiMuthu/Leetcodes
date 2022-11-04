public class ValidSyntax {
    public static void main(String[] args) {
        ValidSyntax validSyntax = new ValidSyntax();
        validSyntax.start();
    }

    private void start() {
        String syntax = "{(a+b){}})";
        int count=0;
        for(int i=0;i<syntax.length();i++){
            if(count<0)
                break;
            if((syntax.charAt(i)=='{')||(syntax.charAt(i)=='(')||(syntax.charAt(i)=='['))
              count++;
            if ((syntax.charAt(i)=='}')||(syntax.charAt(i)==')')||(syntax.charAt(i)==']'))
                count--;
        }
        System.out.println(count);
    }
}
