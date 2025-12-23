class printDigitSum {
    public static void main(String args[]){
        int n = 12345;
        // O/P 1 2 3 4 5
        printsum(n,0);
    }

    public static void printsum(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum = sum + n%10;
        printsum(n/10,sum);

    } 
}