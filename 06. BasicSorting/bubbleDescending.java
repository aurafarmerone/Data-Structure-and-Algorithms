public class bubbleDescending {
    public static void main(String[] args) {
         int arr[] = new int[]{5,4,1,3,2};
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;

        for(int i=0; i<arr.length; i++){
            for(int j=n-2; j>=0; j--)
            if(arr[j] < arr[j+1]){
                int temp = arr[j+1] ;
                arr[j+1] = arr[j] ;
                arr[j] = temp;
            }
        }
        System.out.println();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    



    }
}
