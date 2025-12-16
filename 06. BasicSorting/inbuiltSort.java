
import java.util.Arrays;
import java.util.Collections;


public class inbuiltSort {
    public static void main(String[] args) {
    // Unsorted Array
        int arr[] = new int[]{5,4,1,3,2};
System.out.println("Unsorted Array:");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
        // inBuilt Sort
        System.out.println();
        
        Arrays.sort(arr); // sort in ascending order
        Arrays.sort(arr,0,3); // with starting indx and ending indx

        Integer[] nums = {5, 2, 9, 1,3};
        Arrays.sort(nums, Collections.reverseOrder()); // descending order sort (only for Object Array)
        Arrays.sort(nums, 0, 4, Collections.reverseOrder());


        System.out.println();
        // Sorted Array
        System.out.println("Static Array arr:");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
          System.out.println();
        System.out.println("Object Array nums:");
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
    
    }      
}
