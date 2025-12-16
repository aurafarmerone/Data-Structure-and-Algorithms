import java.util.*;
import java.lang.Math;
public class shortestRoute {
    public static void main(String[] args) {
        
        String dir = "WNEENESENNN";
        System.out.println("Displacement is : "+displacement(dir));
    }

    public static int displacement(String str){
        int n= str.length();
        int x=0;
        int y=0;
        for(int i=0; i<n ; i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else if(str.charAt(i) =='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int dis = (float)Math.sqrt( x*x + y*y) ;
        return dis;
    }
}
