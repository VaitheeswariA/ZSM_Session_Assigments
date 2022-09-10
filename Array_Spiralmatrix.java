import java.util.Scanner;
public class Spiralmatrix {

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
		spiralform(mat);
	}
	static void spiralform(int[][] matrix)
	{
		int left=0,right=matrix[0].length-1,high=0,low=matrix.length-1;
		while(left<matrix[0].length-1)
		{
			for(int j=left;j<=right;j++)
			{
				System.out.print(matrix[left][j]+" ");
			}
			left++;
			
			for(int i=left;i<right;i++)
			{
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			
			for(int j=low;j>=high;j--)
			{
				System.out.print(matrix[low][j]+" ");
			}
			low--;
			
			for(int i=low;i>high;i--)
			{
				System.out.print(matrix[i][high]+" ");
			}
			high++;
		}
	}
}
