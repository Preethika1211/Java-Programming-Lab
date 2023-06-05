import java.util.Scanner;
class Shape
{
void area(int r)
{
System.out.println("The area of circle = " + (3.14*r*r));
}
void area(int l,int bre)
{ 
System.out.println("The area of rectangle = " + (l*bre));
}
void area(double s)
{
System.out.println("The area of square = " + (s*s));
}
}
public class Overload{
public static void main(String args[]){
Shape a = new Shape();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of circle:");
int p = sc.nextInt();
System.out.println("Enter the length and breadth of rectangle:");
int q = sc.nextInt();
int r = sc.nextInt();
System.out.println("Enter the side of square:");
double s = sc.nextDouble();
a.area(s);
a.area(p);
a.area(q,r);
}
}
