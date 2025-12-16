public class Binary2Deci  {
    public static void main(String[] args) {
        int res = b2d(1000);
        System.out.println(res);
    }

    public static int b2d(int x){
        int ld;
        int res = 0; // decimal 
        int i= 0; // power
        while(x>0){
             ld = x%10; // 1
             res = res + ld * (int)Math.pow(2,i);
             x = x/10;
             i++;
        }
        return res;
    }
}
