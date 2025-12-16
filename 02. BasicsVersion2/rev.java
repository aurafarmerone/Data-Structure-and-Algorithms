class rev {
    public static void main(String args[]){

        int n = 12345; // print 1 2 3 4 5

/*      Approach 1 
        rev = 54321
        print rev % 10 and rev / 10

        Approach 2
        print n / 10000 .... 
*/
int rev = 0;
int i = 0;
int ld;
    while (n>0){
        ld = n%10; 
        rev = rev*10 + ld ;
        i++;
        n = n/10;
    }
    System.out.println(rev);

        /////////////////////////////////
        while(rev>0){
        System.out.println(rev%10);
        rev = rev/10;

        }
  
  ////////////////////////// APPROACH 2 //////////////////////
        int x = 12345;
        int count = 5;

        while(x>0){
            int fd = x/((int)Math.pow(10,count-1));
            System.out.println(fd);
            x = x%((int)Math.pow(10,count-1));
            count--;
        }
  
  
    }
}