
public class Matrix {
    
    int[][] arr;
    
    public Matrix() {
        arr = new int[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    }
    
    public Matrix(int[][] arr) {
        this.arr = arr;
    }
    
    public int[][] mAdd(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }
    
    public int[][] mSub(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return arr3;
    }
    
    public int[][] mMul(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return arr3;
    }
    
   
    public void printMatrix(int[][] matrix) {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix(new int[][] {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        });
        
        int[][] addResult = m1.mAdd(m1.arr, m2.arr);
        int[][] subResult = m2.mSub(m1.arr, m2.arr);
        int[][] mulResult = m1.mMul(m1.arr, m2.arr);
        
        System.out.println("Addition Result:");
        m1.printMatrix(addResult);
        
        System.out.println("\nSubtraction Result:");
        m1.printMatrix(subResult);
        
        System.out.println("\nMultiplication Result:");
        m1.printMatrix(mulResult);
    }
}