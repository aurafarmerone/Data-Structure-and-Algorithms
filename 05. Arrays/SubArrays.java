public class SubArrays{
    public static void TotalSubArrays(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i ; k <= j ; k++){
                System.out.print(arr[k]);
             }
             System.out.print(" ");
            }
            System.out.println();
        }
       

    }
    public static void main(String[] args) {
        
    int nums[] = {2,4,6,8,9};
    TotalSubArrays(nums);

    }
}
