public class sumofNum {
    public static void main(String[] args) {
        // RECURSION
        int n = 5;
        printSum(5);
       
    }

    public static void printSum(int n , int sum){
       // BASE CASE
        if(n==0){
            System.out.println("Sum = "+sum);
            return;
        }
        
        //WORK + TRUST THE FUNCTION
        sum = sum + n ;
        printSum(n-1,sum);
    }

        // Overloaded method (acts like default sum = 0)
    public static void printSum(int n) {
        printSum(n, 0);
    }
     
}
