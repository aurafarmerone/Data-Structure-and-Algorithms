public class ReverseArray{
    
    public static void ReverseUsing2Pointer(int arr[]){
        int i = 0;
        int j = arr.length-1;
        
        while(i<j){
            int temp = arr[i];
            arr[i] =  arr[j];
            arr[j] = temp;
            

            i++;
            j--;
        }
        
    }

    public static void Reverse(int arr[]){
        int n = arr.length;
        for(int i=0; i<=n/2;i++){
            int temp = arr[i];
            arr[i] =  arr[n-i-1];
            arr[n-i-1] = temp;
        }
        
    }


    public static void main(String[] args) {
        
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    
    ReverseUsing2Pointer(arr);
    
    for(int i=0 ; i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    

    }
}
