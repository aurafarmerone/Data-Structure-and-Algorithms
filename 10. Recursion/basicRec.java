public class basicRec {
    public static void main(String[] args) {
        // RECURSION
        /* 
        1.BASE CASE
        2.WORK
        3.SMALL FUNCTION CALL(TRUST)
        */
        
        // PRINT NUM IN DECRESING ORDER (n to 1)
        printNaturalDec(10);
        System.out.println();
        printNaturalInc(10);
    }

    public static void printNaturalDec(int n){
       // BASE CASE
        if(n==0){
            return;
        }
        // WORK TO PRINT NUMBER
        System.out.print(n+" ");
        
        // TRUST THE FUNCTION
        printNaturalDec(n-1);
    }

     public static void printNaturalInc(int n){
       // BASE CASE
        if(n==0){
            return;
        }
        // TRUST THE FUNCTION
        printNaturalInc(n-1);

        // WORK TO PRINT NUMBER
        System.out.print(n+" ");
        
        
    }
}
