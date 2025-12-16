public class SelectionSort {
    public static void main(String[] args) {
       // Unsorted Array
        int arr[] = new int[]{5,4,1,3,2};

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
        // Selection Sort
        int min;
        int minIdx = -1;
        for(int i=0 ; i<n ; i++){
            min = arr[i];
            for(int j=i+1 ; j< n ; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIdx = j;
                }
            }

            // swap arr[i] , arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

        }

        // Sorted Array
        System.out.println();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}
