class Matrix // I should not have complicated it by making this class should've just used 2d arrays 😭
{
    int rows,cols;
    int[][] mat;

    Matrix(int[] nums,int r, int c){
        this.rows=r;
        this.cols=c;
        this.mat=new int[rows][cols];
        
        if (nums.length != rows*cols){
            throw new IllegalArgumentException("Number of elements don't fit the specified dimensions.");
        }
        
        int n=0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                mat[i][j]=nums[n++];
            }
        }
    }

    void display(){
        for (int i=0;i<rows;i++){
            System.out.print("| ");
            for (int j=0;j<cols;j++){
                System.out.print(mat[i][j]+" "); 
            }
            System.out.println("|");
        }
    }


}

public class MatrixMultiplication
{
    public Matrix multiply(Matrix A, Matrix B){
        if (A.cols!=B.rows){
            throw new IllegalArgumentException("Multiplication between the matrices not possible.");
        }
        
        
        int[] elements= new int[A.rows*B.cols];

        int index=0;
        for (int i = 0; i < A.rows; i++) { //For every row in A
            for (int j = 0; j < B.cols; j++) { // Match a column in B
                int sum = 0;
                for (int k = 0; k < A.cols; k++) { // The C element is the addition of all the multiplications of all the A elements with matched B elements 
                    sum+=A.mat[i][k] * B.mat[k][j];                  // elements are matched at index k
                }
                elements[index++]=sum;
            }
        }
        Matrix C = new Matrix(elements,A.rows,B.cols);

        return C;

        
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6};      // 2x3
        int[] b = {7, 8, 9, 10, 11, 12};   // 3x2

        Matrix A = new Matrix(a, 2, 3);
        Matrix B = new Matrix(b, 3, 2);

        Matrix C = new MatrixMultiplication().multiply(A, B);

        System.out.println("A:");
        A.display();
        System.out.println("B:");
        B.display();
        System.out.println("C = A x B:");
        C.display();
    }



}

