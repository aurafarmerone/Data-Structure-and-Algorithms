public class mergeSorting {
    public static void main(String[] args) {
        
        int arr[] = new int[]{7,3,4,2,8,1};

        // UNSORTED
        System.out.println("UNSORTED ARRAY:");
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length -1);
        System.out.println("SORTED ARRAY:");
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }

    public static void mergeSort(int arr[] , int si , int ei){

        if(si >= ei){
            return;
        }
        int mid = (si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        mergingProcess(arr,si,mid,ei);
    }

    public static void mergingProcess(int arr[] , int si , int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k=0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k] = arr[j];
            k++;
            j++;
        }


        for(k=0, i=si; k< temp.length ; k++,i++){
            arr[i]= temp[k] ;
        }
    }
}
