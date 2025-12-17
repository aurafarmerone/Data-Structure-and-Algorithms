public class opr {
    public static void main(String[] args) {
        
        // pre increment >>> change first then use
        int a = 10;
        int b = ++a; // a = 11

        System.out.println("a : "+a + "\n"+"b : "+b);


        // post increment
        int x = 10;
        int y = x++; // x = 10 >>> after use next x = 11

        System.out.println("x : "+x + "\n"+"y : "+y);

    }
}
