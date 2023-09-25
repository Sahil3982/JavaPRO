public class twosum {
    static void spiralOrder(int[][] matrix) {
        int left = 0, right = matrix.length - 1;
        int top = 0, bottom = matrix.length - 1;
        while (top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                System.out.println(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;

            if (top<=bottom){
            for (int i = right; i >= left; i--) {
                System.out.println(matrix[bottom][i]);
            }      }
            bottom--;
            if (left<=right){
            for (int i = bottom; i >= top; i--) {
                System.out.println(matrix[i][left]);
            }
            left++;
            }
        }
    }


}
