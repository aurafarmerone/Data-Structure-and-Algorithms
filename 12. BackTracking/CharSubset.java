public class CharSubset {

    public static void main(String[] args) {
        String Str = "abc";
        printSubset(Str, "", 0);

    }

    public static void printSubset(String str, String ans, int i){

        // base case
        if(str.length() == i){
            System.out.println(ans);
            return;
        }

        // yes choice
        printSubset(str, ans + str.charAt(i), i+1);

        // no choice
        printSubset(str, ans, i+1);
    }
}