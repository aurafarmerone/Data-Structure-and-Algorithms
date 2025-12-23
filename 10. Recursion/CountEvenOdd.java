class CountEvenOdd {
    public static void main(String args[]){
        int n = 100;
        // O/P 1 2 3 4 5
        count(n,0,0);
    }

    public static void count(int n , int even , int odd){
        if(n==-1){
            System.out.println("Total Even = "+ even);
            System.out.println("Total Odd = "+ odd);
            return;
        }
        
        if(n%2 == 0){
            even++;
        }
        else{
            odd++;
        }

        count(n-1,even,odd);

    } 
}