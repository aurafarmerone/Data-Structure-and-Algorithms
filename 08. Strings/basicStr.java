import java.util.*;
public class basicStr {
    public static void main(String[] args) {
        // Creation (immutable)
        String alpha = "abcde";
        String str = new String("Hello");

        // input 
        String  name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        name = sc.nextLine();

        // Output
        System.out.println(name);

        // length function
        int l = name.length();
        System.out.println(l);

        // concatenation
        String First = "Tony";
        String Last = "Stark";
        String concat = First+Last;
        System.out.println(concat);

        System.out.print("CharAt : "+concat.charAt(0));

        // charAt function
        printChar(concat);

        // substring
        System.out.print(concat.substring(0,5)); // 5 is excluded. "TonyStark" -> TonyS
       
    }
    public static void printChar(String str){
         for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    
    

}
