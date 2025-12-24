public class printFibonacci {
    public static void main(String[] args) {
        printFibo(10);
    }

    public static void printFibo(int n , int a , int b){
        if(n==0){
            return;
        }
        System.out.print((a+b) +" ");
        printFibo(n-1,b,a+b);

    }

    // overloading
    public static void printFibo(int n){
        System.out.print(0 + " ");
        System.out.print(1+" ");
        printFibo(n-2,0,1);
    }
}
