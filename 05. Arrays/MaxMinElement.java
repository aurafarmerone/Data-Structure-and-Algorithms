public class MaxMinElement {
    public static void main(String[] args) {
        int arr[] = {2,1,3,7,8,9,6,0,3,8};
        System.out.println("MAX is: "+ maxElement(arr));
        System.out.println("MIN is: "+ minElement(arr));



    }
    public static int maxElement(int nums[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]>largest){
                largest = nums[i] ;
            }
        }
        return largest;
    }
    public static int minElement(int nums[]){
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]<smallest){
                smallest = nums[i] ;
            }
        }
        return smallest;
    }
}
