import java.util.*;
public class inverted_full_primid {
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter value=");
int n=input.nextInt();
for(int i=n;i>=1;i--)
{
 for(int j=0;j<n-i;j++)
 {
 System.out.print(" ");
 }
 for(int k=1;k<=i;k++)
 {
 System.out.print(" *");
 }
 System.out.println();
}
}
}

