public class AdvPattern {
    public static void main(String[] args) {
        HollowRectangle(10,5);
        InvertedRotatedHalfPyramid(10);
        InvertedHalfPyramidNumber(10);
        ZeroOneTriangle(10);
        Pyramid(7);
        HalfButterFly(5);
        InvertedHalfButterFly(5);
        ButterFly(10);
        CombinedButterFly(10);
        SolidRhombus(7);
        HollowRhombus(7);
        NumberPyramid(5);
        HalfLeftPalindrome(5);
        HalfRightPalindrome(5);
        Palindrome(7);
    }

    /* HOLLOW RECTANGLE

    ******
    *    *
    *    *
    ******
    
    */
    public static void HollowRectangle(int l,int b){
        
        for(int i=1; i<=b ; i++){
            for(int j=1; j<=l ; j++){
                if(i == 1 || i == b || j == 1 || j == l){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /* INVERTED & ROTATED HALF PYRAMID

          *
         **
        ***
       ****
    
    */
    public static void InvertedRotatedHalfPyramid(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=n-i ; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                    System.out.print("*");
            }
            
            System.out.println();
         }
        }
    /* INVERTED HALF PYRAMID with Numbers

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    
    */
    public static void InvertedHalfPyramidNumber(int n){
        
        for(int i=1; i<=n ; i++){
            int K=1;
            for(int j=1; j<=n-i+1 ; j++){
                    System.out.print(K+" ");
                    K++;
            }
            
            System.out.println();
         }
    } 

    /* 0 1 Triangle

    1 
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    
    */
    public static void ZeroOneTriangle(int n){
        
        for(int i=1; i<=n ; i++){
            
            for(int j=1; j<=i ; j++){
                    if((i+j)%2 != 0){
                        System.out.print(0 +" ");
                    }
                    else{
                        System.out.print(1+" ");
                    }  
            }
            
            System.out.println();
         }
    } 

/*   PYRAMID

      *
     ***
    *****
   *******
  *********
 ***********
*************

    */
    public static void Pyramid(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=n-i ; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ; j++){
                    System.out.print("*");
            }
            
            System.out.println();
         }
        }    

/*   Half Butterfly

    *------*
    **----**
    ***--***
    ********

    */
    public static void HalfButterFly(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=i ; j++){
                    System.out.print("*");
            }
            for(int j=1; j<=2*(n-i) ; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                    System.out.print("*");
            }
            
            System.out.println();
             }
        } 

/*  Inverted Half Butterfly
 
    ********
    ***--***
    **----**
    *------*

    */
    public static void InvertedHalfButterFly(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=n-i+1 ; j++){
                    System.out.print("*");
            }
                for(int j=1; j<=2*(i-1) ; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=n-i+1 ; j++){
                    System.out.print("*");
            }
            
            System.out.println();
         }
        } 

/*   Butterfly
 
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

    */
    public static void ButterFly(int n){
        
        HalfButterFly(n/2);
        InvertedHalfButterFly(n/2);
        } 

/*  Combined Butterfly
 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

    */
    public static void CombinedButterFly(int n){
        
        HalfButterFly(n/2);
        InvertedCombinedHalfButterFly(n/2);
        }  
        
/* InvertedCombinedHalfButterFly

****  ****
***    ***
**      **
*        *

 */
     public static void InvertedCombinedHalfButterFly(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=n-i ; j++){
                    System.out.print("*");
            }
                for(int j=1; j<=2*(i) ; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=n-i ; j++){
                    System.out.print("*");
            }
            
            System.out.println();
         }
        }           

/* Solid Rhombus

   *****
  *****
 *****
*****

 */
     public static void SolidRhombus(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=n-i ; j++){
                    System.out.print(" ");
            }
                for(int j=1; j<=n ; j++){
                    System.out.print("*");
            }
            
            System.out.println();
         }
        }           




/* Hollow Rhombus

   *****
  *   *
 *   *
*****

 */
     public static void HollowRhombus(int n){
        
        for(int i=1; i<=n ; i++){

            for(int j=1; j<=n-i ; j++){
                    System.out.print(" ");
            }
                for(int j=1; j<=n ; j++){
                    if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
         }
        }  

/* Number Pyramid

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5    

 */
     public static void NumberPyramid(int n){
        int K = 1;
        for(int i=1; i<=n ; i++){
            
            for(int j=1; j<=n-i ; j++){
                    System.out.print(" ");
            }
                for(int j=1; j<=i ; j++){
                   System.out.print(K+" ");
            }
            K++;
            System.out.println();
         }
    }                   

/* Half Left Palindrome

        1
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1     

 */
     public static void HalfLeftPalindrome(int n){
        int K;
        for(int i=1; i<=n ; i++){
            K = i;
            for(int j=1; j<=2*(n-i) ; j++){
                    System.out.print(" ");
            }
                for(int j=1; j<=i ; j++){
                   System.out.print(K+" ");
                   K--;
            }
    
            System.out.println();
         }
    } 
/* Half Right Palindrome

_
2  
2 3 
2 3 4 
2 3 4 5     

 */
     public static void HalfRightPalindrome(int n){
        int K;
        for(int i=1; i<=n ; i++){
            
            if(i==1){
                System.out.println(" ");
                continue;
            }
            K = 2;
            for(int j=1; j<=i-1 ; j++){
                   System.out.print(K+" ");
                   K++;
            }
    
            System.out.println();
         }
    } 

/*  Palindrome

        1
      2 1 2 
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5    

 */
     public static void Palindrome(int n){
     // Ist Left Half Palindrome
        int K;
        for(int i=1; i<=n ; i++){
            K = i;
            for(int j=1; j<=2*(n-i) ; j++){
                    System.out.print(" ");
            }
                for(int j=1; j<=i ; j++){
                   System.out.print(K+" ");
                   K--;
            }
    
    
    // 2nd Right Half Palindrome
             if(i==1){
                System.out.println(" ");
                continue;
            }
            K = 2;
            for(int j=1; j<=i-1 ; j++){
                   System.out.print(K+" ");
                   K++;
            }

            System.out.println();
         }

     
    } 

}

