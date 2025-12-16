public class countSort {
    public static void main(String[] args) {
    // Unsorted Array
        int arr[] = new int[]{5,4,1,3,1,2,5,3,4};

        System.out.print("Unsorted Array: ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
        // count Sort
         int max = Integer.MIN_VALUE;

         // finding maximum
         for(int  i=0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
         }

         // creating new array of maximum size

         int freq[] = new int[max+1];

    // count freq.
        for(int i=0; i<arr.length ;i++ ){
            freq[arr[i]]++;
        }

        // put element as per freq in org array
        int k=0;
        for(int i=0; i<freq.length ; i++){
            while(freq[i] != 0){
                arr[k] = i;
                k++;
                freq[i]--;
            }
        }
        // Sorted Array
        System.out.println();
        System.out.print("Sorted Array: ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    
    }      
}
