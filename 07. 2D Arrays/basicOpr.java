import java.util.*;
public class basicOpr {
    public static void main(String[] args) {
        // creation        
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // input
        for(int i=0; i<arr.length ; i++){
            for(int j=0; j<arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
         
         // output
         for(int i=0; i<arr.length ; i++){
            for(int j=0; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
