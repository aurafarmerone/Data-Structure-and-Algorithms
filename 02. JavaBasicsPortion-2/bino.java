public class bino {
    public static void main(String[] args) {
        int res = binomial(5,2);
        System.out.println(res);


    }

    public static int binomial(int n, int r){
        return (fact(n)/fact(r)*(fact(n-r)));
    }

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
