// find first occurance of a number in array using recursion

public class firstOccur {
    public static void main(String[] args) {
        // RECURSION
        int nums[] = new int[]{7,3,6,1,9,0,1,2,2,3,4,5,4,4,1};
        int res = firstoccurance(nums,0, 8);
        System.out.print("idx is" + res);
    }

    public static int firstoccurance(int arr[], int i, int key){
       // BASE CASE
        if(i==arr.length-1){
            return -1; // not found
        }
        // WORK
        if(arr[i] == key){
            return i;
        }
        // TRUST FUNCTION
        return firstoccurance(arr,i+1,key);
    }

     
}
