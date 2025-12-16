public class BinarySearch{
    public static int BinarySearch(int arr[], int key){
        int i = 0;
        int j = arr.length-1;
        int midIdx ;
        while(i<j){
            midIdx = (i+j) /2;
            if(key == arr[midIdx]){
                return midIdx;
            }
            else if(key>arr[midIdx]){
                i = midIdx + 1;
            }
            else{
                j = midIdx -1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Element Found at Idx : "+ BinarySearch(arr,8));

    }
}
