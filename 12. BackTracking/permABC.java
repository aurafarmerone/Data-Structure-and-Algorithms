public class permABC {

    // with REPETATION
    public static void main(String[] args) {
        perm("" , 0);
    }

    public static void perm(String ans, int length){
        if(length == 3){
            System.out.println(ans);
            return;
        }

        for(char i='a'; i <= 'c' ; i++){
            perm(ans+i,length+1);
        }
    }
}