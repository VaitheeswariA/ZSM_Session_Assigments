import java.util.*;
public class Nestedif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int experience=sc.nextInt();
		int careerbreak=sc.nextInt();
		boolean inter_done=sc.nextBoolean();
		boolean bg_done=sc.nextBoolean();
		if(age>=24)
		{
			if(experience>=2)
			{
				if(careerbreak<5)
				{
					if(inter_done && bg_done)
					{
						System.out.println("Can join ZSM");
					}
					else
					{
						System.out.println("Onboarding inprogress");
					}
				}
				else
				{
					System.out.println("career break extends the mentioned period of duration");
				}
			}
			else
			{
				System.out.println("Experience duration doesn't match");
			}
		}
	}

}
