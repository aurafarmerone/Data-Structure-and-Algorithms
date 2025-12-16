// find last occurance of a number in array using recursion

public class LastOccurance {
    public static void main(String[] args) {
        // RECURSION
        int nums[] = new int[]{4,7,3,6,1,9,0,1,2,2,3,4,5,4,1,4};
        int res = Last_Occurance(nums,0, 4,-1);
        System.out.print("idx is " + res);
    }

    public static int Last_Occurance(int arr[], int i, int key, int last_idx){
       // BASE CASE
        if(i==arr.length){
            return last_idx; 
        }
        // WORK
        if(arr[i] == key){
             last_idx = i;
        }
        // TRUST FUNCTION
        return Last_Occurance(arr,i+1,key,last_idx);
    }


    // approach 2: check from backward like base case i==0 Last_Occurance(arr,arr.length - 1,key)
    public static int lastoccurance(int arr[], int n, int key){ // n = arr.length-1
       // BASE CASE
        if(i == -1){
            return -1; // not found
        }
        // WORK
        if(arr[i] == key){
            return i;
        }
        // TRUST FUNCTION
        return lastoccurance(arr, n - 1,key);
    }
}
