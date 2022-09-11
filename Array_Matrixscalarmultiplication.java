import java.util.Arrays;
import java.util.Scanner;
public class ScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		int scalar=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=scalar * sc.nextInt();
			}
		}
		System.out.print(Arrays.deepToString(mat));
		
	}

}
