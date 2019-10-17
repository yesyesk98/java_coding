import java.util.*;
public class Binarytodecimal
{
public static void main(String args[])
{
int decimal=0;
int bit=0;
int x=1;
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
while(b>0)
{
bit=b%10;

decimal=decimal+(bit*x);

b=b/10;
x=x*2;
}
System.out.println(" "+decimal);

}
}
