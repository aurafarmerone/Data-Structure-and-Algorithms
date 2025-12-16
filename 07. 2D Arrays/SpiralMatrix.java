// https://www.youtube.com/watch?v=73j2ipxR958
/*
 dir = 0 → Left  → Right   (top row)
dir = 1 → Top   → Bottom  (right column)
dir = 2 → Right → Left    (bottom row)
dir = 3 → Bottom→ Top     (left column)

 */
public class SpiralMatrix {
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        spiralOrder(mat);

    }

    public static void spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        int dir = 0; // direction controller

        while (top <= bottom && left <= right) {

            if (dir == 0) { // left -> right
                for (int col = left; col <= right; col++) {
                    System.out.print(matrix[top][col] + " ");
                }
                top++;
            }

            else if (dir == 1) { // top -> bottom
                for (int row = top; row <= bottom; row++) {
                    System.out.print(matrix[row][right]+" ");
                }
                right--;
            }

            else if (dir == 2) { // right -> left
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col]+" ");
                }
                bottom--;
            }

            else { // dir == 3 → bottom -> top
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left]+" ");
                }
                left++;
            }

            dir = (dir + 1) % 4; // rotate direction or if(dir == 4){ dir = 0;}
        }

        
    }


}

