class armstrong {
    public static void main(String args[]){
        int n = 143;
        // O/P 1 2 3 4 5
        checkArm(143,0,143);
    }

    public static void checkArm(int n , int armValue, int org){
        if(n==0){
            if (org == armValue){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        return;
        }

        armValue = armValue + (int)Math.pow(n%10 , 3) ;
        checkArm(n/10,armValue,org);
    } 
}