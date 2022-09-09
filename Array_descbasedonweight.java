import java.util.*;
public class Descbasedonweight {
	public static void main(String[] args) {
		int arr[]={49,36,8,10,12};
		int w[]=new int[5];
		HashMap<Integer,Integer> wt=new HashMap<Integer,Integer>(); 
		for(int i=0;i<5;i++)
		{
		    int sum=0;
		    double sqrt=Math.sqrt(arr[i]);
		    if(sqrt-Math.floor(sqrt) ==0)
		    {
		        sum+=5;
		    }
		    if(arr[i]%4 ==0 && arr[i]%6 ==0)
		    {
		        sum+=4;
		    }
		    if(arr[i]%2 ==0)
		    {
		        sum+=3;
		    }
		    wt.put(arr[i],sum);
		    w[i]=sum;
		}
		Arrays.sort(w);
		for(int i=w.length-1;i>=0;i--)
		{
		for(Map.Entry<Integer,Integer> weight:wt.entrySet())
		{
		    if(weight.getValue()==w[i])
		        System.out.print("<"+weight.getKey()+","+w[i]+">");
		    wt.replace(weight.getKey(),w[i],-1);    
		}
		}
	}
}



