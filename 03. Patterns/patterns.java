import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. : ");
        int n = sc.nextInt();
        // Star(5);
        // invertedStar(5);
        // InvertedHalfPyramidNum(5);
        CharTri(n);


    }

    public static void Star(int n){
/*    
                    *
                    **
                    ***
                    ****

*/
        for(int i=1 ; i<=n; i++){
            for(int j=1; j<=i ; j++){
                        System.out.print("*");
            }
            System.out.println();
        }
    } 

    public static void invertedStar(int n){
/*    

                    ****
                    ***
                    **
                    *

*/
        for(int i=1 ; i<=n; i++){
            for(int j=1 ; j<=n-i+1 ; j++ ){
                         System.out.print("*");
            }
            System.out.println();
        }
    } 

    public static void HalfPyramidNum(int n){
/*    
                    1
                    12
                    123
                    1234

*/      
        for(int i=1 ; i<=n; i++){
            int K=1;
            for(int j=1 ; j<=i ; j++ ){
                         System.out.print(K);
                         K++;
            }
            System.out.println();
        }
    } 

       public static void InvertedHalfPyramidNum(int n){
/*    
                    1234
                    123
                    12
                    1
*/      
        for(int i=1 ; i<=n; i++){
            int K=1;
            for(int j=1 ; j<=n-i+1 ; j++ ){
                         System.out.print(K);
                         K++;
            }
            System.out.println();
        }
    } 

       public static void Floyd(int n){
/*    
                    1
                    2 3
                    4 5 6
                    7 8 9 10

*/      int K=1;
        for(int i=1 ; i<=n; i++){
            for(int j=1 ; j<=i ; j++ ){
                         System.out.print(K + " ");
                         K++;
            }
            System.out.println();
        }
    } 

       public static void CharTri(int n){
/*    
                    A
                    B C
                    D E F
                    G H I J

*/      char K='A';
        for(int i=1 ; i<=n; i++){
            for(int j=1 ; j<=i ; j++ ){
                         System.out.print(K + " ");
                         K++;
            }
            System.out.println();
        }
    } 

}
