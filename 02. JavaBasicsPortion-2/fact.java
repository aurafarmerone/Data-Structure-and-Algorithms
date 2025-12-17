public class fact {
    public static void main(String[] args) {
        
        int res = factorial(7);
        System.out.print("Fact is : " + res);

    }

    public static int factorial(int n){
        int fact = 1;

        for(int i=1;i<=n;i++){
            fact = fact * i ;

        }

        return fact;
    }
}
