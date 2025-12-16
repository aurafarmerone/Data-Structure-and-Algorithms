// check if array is sorted or not using recursion

public class ArraySorted {
    public static void main(String[] args) {
        // RECURSION
        int nums[] = new int[]{1,2,3,4,5};
        boolean res = isSorted(nums,0);
        System.out.print(res);
    }

    public static boolean isSorted(int arr[], int i){
       // BASE CASE
        if(i==arr.length-1){
            return true;
        }
        // WORK
        if(arr[i]>arr[i+1]){
            return false;
        }
        // TRUST FUNCTION
        return isSorted(arr,i+1);
    }

     
}
