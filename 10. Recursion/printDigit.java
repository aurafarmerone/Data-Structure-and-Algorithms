class printDigit {
    public static void main(String args[]){
        int n = 12345;
        // O/P 1 2 3 4 5
        printn(n);
    }

    public static void printn(int n){
        if(n==0){
            return;
        }
        printn(n/10);
        System.out.println(n%10);

    } 
}