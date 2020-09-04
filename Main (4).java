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
		System.out.println("Enter the numer of Students");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    int a[]=new int[11];
		    System.out.println("Enter the "+i+"Quarterly Marks:");
		    for(int j=1;j<=5;j++)
		    {
		        switch(j)
		        {
		            case 1:
		            System.out.println("Engish:");
		            a[j]=sc.nextInt();
		            break;
	                case 2:
		            System.out.println("Tamil:");
		            a[j]=sc.nextInt();
		            break;
		            case 3:
		            System.out.println("Maths:");
		            a[j]=sc.nextInt();
		            break;
		            case 4:
		            System.out.println("Science:");
		            a[j]=sc.nextInt();
		            break;
		            case 5:
		            System.out.println("Social Science:");
		            a[j]=sc.nextInt();
		            break;
		        }
		    }
		    System.out.println("Enter the "+i+"Half yearly Marks:");
		    for(int j=6;j<=10;j++)
		    {
		        switch(j)
		        {
		            case 6:
		            System.out.println("Engish:");
		            a[j]=sc.nextInt();
		            break;
	                case 7:
		            System.out.println("Tamil:");
		            a[j]=sc.nextInt();
		            break;
		            case 8:
		            System.out.println("Maths:");
		            a[j]=sc.nextInt();
		            break;
		            case 9:
		            System.out.println("Science:");
		            a[j]=sc.nextInt();
		            break;
		            case 10:
		            System.out.println("Social Science:");
		            a[j]=sc.nextInt();
		            break;
		        }
		    }
		    System.out.println("Average of "+i+"Students");
		    for(int k=1,j=6;k<=5;k++,j++)
		    {
		        double sum=(a[k]+a[j])/2.0;
		         switch(k)
		        {
		            case 1:
		            System.out.println("Engish:+sum");
		           
		            break;
	                case 2:
		            System.out.println("Tamil:+sum");
		           
		            break;
		            case 3:
		            System.out.println("Maths:+sum");
		          
		            break;
		            case 4:
		            System.out.println("Science:+sum");
		         
		            break;
		            case 5:
		            System.out.println("Social Science:+sum");
		            
		            break;
		        }
		    }
		}
	}
}
