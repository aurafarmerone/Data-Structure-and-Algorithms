class xpown{
    public static void main(String args[]){
        int x = 3;
        int n = 12;
        int res = pow(x,n);
        System.out.println(x +"^"+n+" = "+res);
    }

    public static int pow(int x , int n){
        if(n == 1){
            return x;
        }
        return x * pow(x,n-1);
    }
}