public class basicSB {
    public static void main(String[] args) {
        // StringBuilders are MUTUABLE.

        StringBuilder str = new StringBuilder("Tony");
        System.out.println(str);

        Integer a = 10;
        System.out.println(a.toString());


        // Object function also works on SB
        /*
        int a = 10;
        a.toString(); ---> Not works (not an object)
        

        Integer a = 10;
        a.toString(); ---> Works
        */


       // TO ADD ELEMENT in SB
       str.append("xyz");
       System.out.println(str);

// TO CHECK LENGTH
        int l = str.length();
        System.out.println(l);


        // to uppercase or lowercase is string function , to apply on string builder convert sb to s.
        StringBuilder sb = new StringBuilder("hello world");
        String uppercaseString = sb.toString().toUpperCase();
        System.out.println("Uppercase String: " + uppercaseString);


        

    }
}
