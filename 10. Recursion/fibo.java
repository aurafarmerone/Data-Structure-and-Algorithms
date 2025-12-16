public class fibo {
    public static void main(String[] args) {
        // RECURSION
        int n = 7;
        System.out.print(" Fibo of "+n+ "th term is : "+ fiboN(n));
        
        
    }

    public static int fiboN(int n){
       // BASE CASE
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        //WORK + TRUST THE FUNCTION >>> fibo(n=2) = fibo(n=1) + fibo(n=0)
        return fiboN(n-1) + fiboN(n-2);
    }

    

     
}
