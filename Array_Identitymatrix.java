import java.util.Scanner;
public class Identitymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		int dimension=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		boolean isIdentity=check_identity_matrix(mat);
		if(isIdentity)
			System.out.println("Given matrix is an identity");
		else
			System.out.println("Not an identity matrix");
		
		create_identity_matrix(dimension);
	}
	
	static boolean check_identity_matrix(int[][] matrix)
	{
		boolean flag=true;
		if(matrix.length==matrix[0].length)
		{
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix[0].length;j++)
				{
					if((i!=j && matrix[i][j]!=0) || (i==j && matrix[i][j]!=1))
						flag=false;
				}
			}
		}
		else
			flag=false;
		return flag;
	}
	
	static void create_identity_matrix(int row)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				if(i==j)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}

}
