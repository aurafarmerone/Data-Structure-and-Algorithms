public class revString {

    public static void main(String[] args) {
        printStringRev("abcd", 4);
    }

    public static void printStringRev(String str, int i){
        if(i == 0){
            return;

        }
        printStringRev(str.substring(1), i-1);
        System.out.print(str.charAt(0));

    }
}