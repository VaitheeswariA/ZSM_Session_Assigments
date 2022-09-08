import java.util.Scanner;
public class Programpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		if(n%2!=0)
		{
		for(int i=0;i<n;i++)
		{
			int pos=0;
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1)
				{
					System.out.print(str.charAt(pos));
				}
				else
				{
					System.out.print(" ");
				}
				pos++;
			}
			System.out.println();
		}
		}
		else
		{
			System.out.println(0);
		}
	}

}
