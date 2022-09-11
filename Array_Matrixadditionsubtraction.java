import java.util.Scanner;
public class Matrixaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat1=new int[row][col];
		int[][] mat2=new int[row][col];
		int count=0;
		
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					mat1[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					mat2[i][j]=sc.nextInt();
				}
			}
			addition(mat1,mat2);
			subtraction(mat1,mat2);
		
	}
	
	static void addition(int[][] matrix1,int[][] matrix2)
	{
		int[][] sum=new int[matrix1.length][matrix1[0].length];
		System.out.println("Matrix addition:");
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				sum[i][j]= matrix1[i][j]+matrix2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void subtraction(int[][] matrix1,int[][] matrix2)
	{
		int[][] sum=new int[matrix1.length][matrix1[0].length];
		System.out.println("Matrix Subtraction:");
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				sum[i][j]= matrix1[i][j]-matrix2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
