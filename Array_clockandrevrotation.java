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
		display(rotate_ninety_clock(mat));
		
		System.out.println("Rotation of matrix 90 degree anticlock inplace");
		int[][] clone_mat=mat.clone();
		display(rotate_ninety_anticlock(clone_mat));
	}
	
	static int[][] rotate_ninety_clock(int[][] matrix)
	{
		int[][] c=new int[matrix[0].length][matrix.length];
		for(int i=0;i<matrix[0].length;i++)
		{
			for(int j=matrix.length-1;j>=0;j--)
			{
				c[i][j]=matrix[j][i];
			}
		}
		return c;
	}
	
	static int[][] rotate_ninety_anticlock(int[][] matrix)
	{
		int[][] ac=new int[matrix[0].length][matrix.length];
		int pos=0;
		for(int i=matrix[0].length-1;i>=0;i--)
		{
			for(int j=0;j<matrix.length;j++)
			{
				ac[pos][j]=matrix[j][i];
			}
			pos++;
		}
		return ac;
	}
	
	static void display(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
