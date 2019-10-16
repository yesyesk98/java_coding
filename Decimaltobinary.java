import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
String x="";
int a=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
    a=n%2;
    x=a+""+x;
    n=n/2;
}
System.out.println("number is"+x);
	    
	}
}
