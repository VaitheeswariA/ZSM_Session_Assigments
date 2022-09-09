import java.util.*;
public class Matrixrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Rotation of matrix 90 degree clock inplace");
		rotate_ninety_clock(mat);
		int[][] clone_mat=mat.clone();
		System.out.println("Rotation of matrix 90 degree anticlock inplace");
		rotate_ninety_anticlock(clone_mat);
	}
	
	static void rotate_ninety_clock(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=matrix[i].length-1;j>=0;j--)
			{
				System.out.print(matrix[j][i]+" ");
			}
			
			System.out.println();
		}
	}
	
	static void rotate_ninety_anticlock(int[][] matrix)
	{
		for(int i=matrix.length-1;i>=0;i--)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[j][i]+" ");
			}
			
			System.out.println();
		}
	}

}
