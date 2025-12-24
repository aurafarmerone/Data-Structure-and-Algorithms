public class XpowerN {
    public static void main(String[] args) {
        xpown(2,10);
    }

    public static void xpown(int x, int n , int res){
        if(n == 0){
            System.out.println("Ans: "+res);
            return;
        }
        res = res * x;
        xpown(x, n-1, res);
    }

    // overloading
    public static void xpown(int x, int n){
        xpown(x, n , 1);
    }
}