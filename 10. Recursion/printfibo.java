public class printfibo {

    public static void main(String[] args) {
        int n = 7;

        // print first two numbers
        System.out.print("0 1 ");
        printfiboN(n - 2, 0, 1);
    }

    public static void printfiboN(int n, int a, int b) {
        // Base case
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");

        // Recursive call
        printfiboN(n - 1, b, c);
    }
}
