public class sumofNum {
    public static void main(String[] args) {
        // RECURSION
        int n = 5;
        System.out.print(" Sum till "+n+ "th term is : "+ sum(5));
        
        
        
    }

    public static int sum(int n){
       // BASE CASE
        if(n==0){
            return 0;
        }
        
        //WORK + TRUST THE FUNCTION
        return n + sum(n-1);
    }

     
}
