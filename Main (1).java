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
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[10000000];
	    int min=10000000,max=0;
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        if(min>a[i])
	        min=a[i];
	        if(max<a[i])
	        max=a[i];
	        b[a[i]]++;
	    }
	    for(int i=min;i<=max;i++)
	    {
	        if(b[i]==0)
	        System.out.println(i);
	    }
	}
}
