public class SubArraySum{
    public static void MaxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
        
            for(int j=i;j<arr.length;j++){
        
                int Sum = 0;
                for(int k=i ; k <= j ; k++){
                System.out.print(arr[k]);
                Sum = Sum + arr[k];
        
             }
             
             System.out.print(" " + "Sum="+Sum+" , ");
            
             if(Sum > maxSum){
                maxSum = Sum;
             }

            }
            System.out.println();
        }
        System.out.print( "Max Sum ="+maxSum);

    }
    public static void main(String[] args) {
        
    int nums[] = {2,4,6,8,9};
    MaxSubArraySum(nums);

    }
}
