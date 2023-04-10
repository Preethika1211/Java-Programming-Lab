import java.util.*;
class Arraysearch
{
public static void main(String args[])
{
int size,i,num,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
size=sc.nextInt();
int a[]=new int[100];
System.out.println("Enter the array elements:\n");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the number you want to search");
num=sc.nextInt();
for(i=0;i<size;i++)
{
if(num==a[i])
{
System.out.println("The position is:" +i);
f=1;
break;
}
}
if(f==0)
System.out.println("Not found");
}
}
