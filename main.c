/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a,b;
    scanf("%d:%d",&a,&b);
    if(b==00)
    {
    printf("%d degree",a*(360/12));
    }
    else
    {
        int c=360/(b/5);
        printf("%d degree",a*c);
    }

    return 0;
}
