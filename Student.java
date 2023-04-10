import java.util.Scanner;
class Student {
public static void main(String args[]){
int n,total=0,percentage;
Scanner input=new Scanner(System.in);
System.out.print("Enter the number of subjects:");
n=input.nextInt();
int[] marks=new int[n];
System.out.print("Enter marks out of 100:");
for(int i=0;i<n;i++)
{
marks[i]=input.nextInt();
if(marks[i]>100)
{
System.out.print("Enter valid marks:");
break;
}
else
{
total=total + marks[i];
}
}
percentage=total/n;
System.out.println("Sum:"+total);
System.out.println("Percentage="+percentage);
}
}
