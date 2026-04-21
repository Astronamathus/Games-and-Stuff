// Online C compiler to run C program online
#include <stdio.h>
#include <string.h>

int main() {
    
    char s[100];
    printf("Enter a string: ");
    scanf("%s", &s);
    for(int i = 0, n = strlen(s); i < n; i++)
    {
        s[i] -= 32;    
    }
    printf("OUTPUT: %s", s);
    return 0;
}
