import java.util.*;
public class Duplicateusingbitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> dup=new HashMap<>();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]^arr[j]) == 0 && dup.get(arr[i])==null)
				{
					dup.put(arr[i], 1);
				}
			}
		}
		System.out.println("Duplicate elements are:");
		for(Map.Entry<Integer,Integer> val:dup.entrySet())
		{
			System.out.println(val.getKey());
		}
	}

}
