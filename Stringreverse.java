import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		    String str=sc.nextLine();
		    reversestring(str);
		}
	}
	public static void reversestring(String str)
	{
	    String str1="";
	    int l=str.length();
	   
	    for(int j=l-1;j>=0;j--)
	    {
	        str1=str1+str.charAt(j);
	         //System.out.println(str.charAt(j));
	    }
	    System.out.println(""+str1);
	}
}
