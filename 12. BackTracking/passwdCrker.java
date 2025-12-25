public class passwdCrker {

    public static void main(String[] args) {
        perm("" , 3);
    }

    public static void perm(String ans, int length){
        if(length == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<= 9 ; i++){
            perm(ans+i,length-1);
        }
    }
}