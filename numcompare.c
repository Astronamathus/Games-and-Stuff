#include <stdio.h>

int main() 
{
	int x, y;
	printf("Enter X: ");
    scanf("%d", &x);
	printf("Enter Y: ");
    scanf("%d", &y);
    if(x==y)
    	printf("X = Y");
    if(x > y)
    	printf("X > Y");
    else
    	printf("X < Y");
        
    return 0;
}
