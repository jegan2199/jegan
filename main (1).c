/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
int count=0;
void ones(int n)
{
    while(n!=0)
    {
        if(n%10==1)
        {
            count++;
            break;
        }
        n/=10;
    }
}
int main()
{
    int start,end;
    scanf("%d %d",&start,&end);
    for(int i=start;i<=end;i++)
    {
        ones(i);
    }
    printf("%d",count);

    return 0;
}
