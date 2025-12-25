import java.util.Arrays;

class changeArray{
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr));
        chngArr(arr, 0 , 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void chngArr(int arr[] , int i , int val){
        if(i == arr.length){
            System.out.println(Arrays.toString(arr)); // [1,2,3,4,5]
            return;
        }
        arr[i] = val;
        chngArr(arr, i+1, val+1); 
        arr[i] = arr[i] - 2; // backtracking step
    }
}