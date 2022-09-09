import java.util.*;
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr_length=sc.nextInt();
		int[] arr=new int[arr_length];
		for(int i=0;i<arr_length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int rotate_count=sc.nextInt();
		int[] clone_arr=arr.clone();
		System.out.println("After "+rotate_count+" right rotation:");
		right_rotate(arr,rotate_count);
		display(arr);
		
		System.out.println("After "+rotate_count+" left rotation:");
		left_rotate(clone_arr,rotate_count);
		display(clone_arr);
	}
	
	static void right_rotate(int[] arr1,int d)
	{
		reverse(arr1,0,arr1.length-1);
		reverse(arr1,0,d-1);
		reverse(arr1,d,arr1.length-1);
	}
	
	static void left_rotate(int[] arr2,int d)
	{
		reverse(arr2,0,d-1);
		reverse(arr2,d,arr2.length-1);
		reverse(arr2,0,arr2.length-1);
	}
	
	static void reverse(int[] arr,int start,int end)
	{
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}
	
	static void display(int[] arr)
	{
			System.out.print(Arrays.toString(arr));
	}

}
