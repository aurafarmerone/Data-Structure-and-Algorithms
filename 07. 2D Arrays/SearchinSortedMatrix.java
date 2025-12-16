public class SearchinSortedMatrix {
    public static void main(String[] args) {

        //Binary Search: https://leetcode.com/problems/search-a-2d-matrix/description/
        //Staircase Search: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

    int mat[][] = new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    Staircase(mat,33);
    System.out.println(twoDbinarySearch(mat, 37));

    }
    public static void Staircase(int mat[][], int key){
        int i=0;
        int j = mat[0].length - 1;
        int n = mat.length;

        boolean found = false;;
        while(i<n && j>= 0){
            if(key == mat[i][j]){
                System.out.println("Found at "+ i+","+j);
                found = true;
                break;
            }
            else if(key<mat[i][j]){
                // move left
                j--;
            }
            else{
                // move down
                i++;
            }
        }

        if(found == false){
            System.out.println("Not Found!");
        }
    }

    public static boolean twoDbinarySearch(int mat[][], int key){
        for (int r = 0; r < mat.length; r++) {
        if (binarySearch(mat[r], key)) {
            return true;
        }
    }
    return false;

    }

    public static boolean binarySearch(int[] row, int key) {
    int i = 0;                 // i = low
    int j = row.length - 1;    // j = high

    while (i <= j) {
        int mid = i + (j - i) / 2;

        if (row[mid] == key) return true;
        else if (row[mid] < key) i = mid + 1;
        else j = mid - 1;
    }
    return false;
}


}
