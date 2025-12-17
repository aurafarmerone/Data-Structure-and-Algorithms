public class typeconversion {
    public static void main(String[] args) {
        // Type conversion
        int a = 10;
        long x = a; // allowed  

        // lossly data
        long y = 100;
        // int q = y ;// data loss (not allowed implicit) : possible lossy conversion from long to int

        // Type casting (forcefully)
        double s = 837.89;
        int p = (int)s;
        System.out.println(p);





        // type promotion (only for expressions)
        // 1.short,byte and char >>>>>>> int
        // 2.long , double, float >>>>>> long or double or float   
        
        short s1 = 125;
        byte b1 = 98;

        short res = s1 - b1; // automatically convert to int : possible lossy conversion from int to short
        //   short res = (short) (s1 - b1); >>>>> corrected way by type cast
         System.out.println(res);



         /* EXAMPLE 
            byte b = 10;
            b = b*2; ERROR (because byte of 10 is now became (int of 10) in exp.) so int cant be store in b of byte.  

        CORRECT wAY
         b = (byte) b*2;
         OR
         int a = b*2;
*/

    }
}
