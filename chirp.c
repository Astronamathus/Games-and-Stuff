#include <stdio.h>

int main(int argc, char *argv[])
{
    if(argc == 2)
    {
        printf("\n (  %s  )\n", argv[1]); 
        printf("  \\ \n");
        printf("   >o) \n");
        printf("    (_>  woodstock\n\n");
        return 0;
    }
    
    printf("Usage: chirp <message> (one word only)\n");
    return 1;
}
