import java.util.*;
class DecimalBin
{
    int dec;
    String bin;
    DecimalBin()
    {
        dec = 0;
        bin = "";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        dec = sc.nextInt();
    }
    String convert(int n)
    {
        String res = "";
        while(n > 0)
        {
            if(n%2 == 0)
            {
                res = "0" + res;
            }
            else
            {
                res = "1" + res;    
            }
            n /= 2;
        }
        return res;
    }
    void display()
    {
        System.out.println(dec+" in binary is: "+convert(dec));
    }
    public static void main()
    {
        DecimalBin obj = new DecimalBin();
        obj.input();
        obj.display();
    }
}