public class fact {
    public static void main(String[] args) {
        // RECURSION
        int n = 5;
        System.out.print(" Factorial of "+n+ " is : "+ factorial(5));
        
        
        
    }

    public static int factorial(int n){
       // BASE CASE
        if(n==0){
            return 1;
        }
        
        //WORK + TRUST THE FUNCTION
        return n * factorial(n-1);
    }

     
}
