import java.util.Arrays;
import java.util.Scanner;
public class Oddmidevensort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr_length=sc.nextInt();
		int[] arr=new int[arr_length];
		for(int i=0;i<arr_length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int mid=(arr_length-1)/2;
		int left=mid;
		int right=mid+1;
		boolean cond=true;
		for(int i=0;i<arr_length;i++)
		{
			if(cond)
				System.out.print(arr[left--]);
			else
				System.out.print(arr[right++]);
			cond=!cond;
		}
	}

}
