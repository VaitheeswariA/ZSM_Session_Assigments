import java.util.Scanner;
public class Checkmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		boolean flag=true;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		if(row>col)
			System.out.println("Vertical matrix");
		else if(col>row)
			System.out.println("Horizontal matrix");
		else
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(i!=j && mat[i][j]!=0)
						flag=false;
				}
			}
			if(flag)
				System.out.println("diagonal matrix");
			else
				System.out.println("Square matrix");	
		}
		
	}

}
