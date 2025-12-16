public class quickSorting {

    public static void main(String[] args) {

        int arr[] = {7, 3, 4, 2, 8, 1};

        System.out.println("UNSORTED ARRAY:");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSORTED ARRAY:");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }

    public static void quickSort(int arr[], int low, int high) {

        if (low >= high) {
            return;
        }

        int p = partition(arr, low, high);

        // Hoare partition recursion
        quickSort(arr, low, p);
        quickSort(arr, p + 1, high);
    }

    // Hoare partition with FIRST element as pivot
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[low];   // ✅ first element pivot
        int i = low - 1;
        int j = high + 1;

        while (true) {

            // move i from left to right
            do {
                i++;
            } while (arr[i] < pivot);

            // move j from right to left
            do {
                j--;
            } while (arr[j] > pivot);

            // pointers crossed
            if (i >= j) {
                return j;
            }

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
