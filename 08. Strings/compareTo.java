public class compareTo {
    public static void main(String[] args) {
        
        // compareTo : compare two string lexographically
        // compareToignoreCase : 'a' == 'A'( ignore )
        /*  
Returns

  0 : If the current object is equal to the argument object. 
-ve : If the current object is lexicographically less than the argument object. 
+ve : If the current object is lexicographically greater than the argument object. 
        
        ex. current.compareTo(argument);
        i.e "apple" compareto "banana" --> -ve
        */

        String fruits[] = {"apple" , "mango" , "papaya"};

        String largest = fruits[0];

        for(int i=1 ; i< fruits.length ; i++){
            if(fruits[i].compareTo(largest) > 0){
                largest = fruits[i] ;
            }
        }
        System.out.println("Max is : " + largest);

    }
}
