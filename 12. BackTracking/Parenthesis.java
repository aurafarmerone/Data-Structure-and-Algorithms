public class Parenthesis {

    public static void main(String[] args) {
        perm("",0);
    }

    public static void perm(String res, int length){
        if(length == 4){
            System.out.println(res);
            return;
        }

        perm(res+"[", length+1);
        perm(res+"]", length+1);
    }
}