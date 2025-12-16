import java.util.*;

public class switchone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a  = 10;
        int b = 99;

        System.out.println("Enter: ");
        int c = sc.nextInt();
        switch(c){
            case 1: System.out.print(a+b);
                    break;
            case 2: System.out.print(a-b);break;
            default: System.out.print("D");break;
            case 3: System.out.print(b/a);break;

        }

    }
}
