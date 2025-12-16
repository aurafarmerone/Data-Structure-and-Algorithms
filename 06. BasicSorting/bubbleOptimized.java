// O(n^2) ---->  O(n) , only for sorted array

public class bubbleOptimized {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j] ;
                arr[j] = arr[j+1] ;
                arr[j+1] = temp;
                flag = true;
            }
        }
        if(flag == false){
            break;
        }

        }
        System.out.println();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    
}
}