/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    System.out.println("Before Swapping");
	    System.out.println("x="+x);
	    System.out.println("y="+y);
	    System.out.println("After Swapping");
	    x=x+y;
	    y=x-y;
	    x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
