import java.util.*;
import java.lang.*;
public class Main
{
static int n;
static int sum;
public static void main(String args[])
{
int[] arr=new int[20];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter the array elements");

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the elements to be searched");
sum=sc.nextInt();
prettynum(arr,sum);
    
}
public static void prettynum(int arr[],int x)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if((arr[i]+arr[j])==sum)
            {
                System.out.println("element pairs are"+arr[i]+","+arr[j]);
            }
        }
    }
}
}
