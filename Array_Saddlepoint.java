import java.util.*;
public class Saddlepoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat =new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		int saddle_point=-1;
		int s_col=0;
		for(int i=0;i<row;i++)
		{
			int min=mat[i][i];
			for(int j=0;j<col;j++)
			{
				if(min>mat[i][j])
				{
					min=mat[i][j];
					s_col=j;
				}
			}
			int max=min;
			for(int k=0;k<row;k++)
			{
				max=(mat[k][s_col] > max)? mat[k][s_col]:max;
			}
			if(max==min)
			{
				saddle_point=max;
				System.out.println(saddle_point+" is saddle point in this matrix");
				break;
			}
		}
		if(saddle_point==-1)
			System.out.println("No saddle point in this matrix");
		}

}
