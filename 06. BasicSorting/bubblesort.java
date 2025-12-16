public class bubblesort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,1,3,2};
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++)
            if(arr[j] > arr[j+1]){
                int temp = arr[j] ;
                arr[j] = arr[j+1] ;
                arr[j+1] = temp;
            }
        }
        System.out.println();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    
}
}