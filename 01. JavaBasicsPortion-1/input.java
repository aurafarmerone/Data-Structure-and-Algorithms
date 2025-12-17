import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Val (-128 t0 127):");
        byte a = sc.nextByte(); 
        int b = sc.nextInt();
        String str = sc.nextLine();
        
        System.out.println(a);
    }
}
