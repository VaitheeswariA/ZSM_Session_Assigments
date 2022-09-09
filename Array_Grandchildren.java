import java.util.Scanner;
public class Grandchildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[][] arr= {{"luke","shaw"},
						 {"wayne","rooney"},
						 {"rooney","ronaldo"},
						 {"shaw","rooney"}};
		String s=sc.nextLine();
		String child="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i][1].equals(s))
			{
				child=arr[i][0];
				int j=arr[i].length-1;
				for(int pos=0;pos<arr.length;pos++)
				{
					if(arr[pos][j].equals(child))
						{
							count++;
						}
				}
			}
		}
		System.out.println(s+" has "+count+" grandchildren");
	}

}
