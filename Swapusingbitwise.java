import java.util.*;
public class Swapusingbitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();//6-- 0110
		int num2=sc.nextInt();//10--1010
		num1=num1^num2;//-----------1100--12
		num2=num1^num2;//12^10------1010
		//--------------------------0110--6
		num1=num2^num1;//6^12-------1100
		//--------------------------1010-10
		System.out.println("After swap:");
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		
	}

}
