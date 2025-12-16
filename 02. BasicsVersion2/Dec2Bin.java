public class Dec2Bin  {
    public static void main(String[] args) {
        int res = d2b(10);
        System.out.println(res);
    }

    public static int d2b(int x){
        int ld;
        int i = 0;
        int res = 0; // decimal 
        while(x > 0){
             ld = x%2; // 1
             res = res + (ld* (int)Math.pow(10,i));
             x = x/2;
             i++;
        }
        return res;
    }
}
