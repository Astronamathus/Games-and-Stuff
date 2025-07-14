import java.util.*;
class timer
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter timer duration: ");
        System.out.print("Minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Seconds: ");
        int seconds = sc.nextInt();
        int duration = (minutes*60) + seconds;
        minutes = duration / 60;
        seconds = duration % 60;
        System.out.print('\u000C');
        if(minutes < 1)
        {
            for(int i = seconds; i > 0; i--)
            {
                if(i >= 10)
                {
                    System.out.println((minutes) +":" + i);
                    for(double j = 0; j < 250000000; j++)
                    {}
                    System.out.print('\u000C');
                }
                else
                {
                    System.out.println((minutes) +":0" + i);
                    for(double j = 0; j < 250000000; j++)
                    {}
                    System.out.print('\u000C');
                }
            }
        }
        for(int m = minutes; m > 0; m--)
        {
            for(int i = seconds; i > 0; i--)
            {
                if(i >= 10)
                {
                    System.out.println((m) +":" + i);
                    for(double j = 0; j < 250000000; j++)
                    {}
                    System.out.print('\u000C');
                }
                else
                {
                    System.out.println((m) +":0" + i);
                    for(double j = 0; j < 250000000; j++)
                    {}
                    System.out.print('\u000C');
                }
            }
            System.out.println(m+":00");
            for(double j = 0; j < 250000000; j++)
            {}
            System.out.print('\u000C');
            for(int s = 59; s > 0; s--)
            {
                if(s < 10)
                {
                    System.out.println((m-1) +":0" + s);
                    for(double j = 0; j < 250000000; j++)
                    {}
                    System.out.print('\u000C');
                }
                else
                {
                    System.out.println((m-1) +":" + s);
                    for(double j = 0; j < 250000000; j++)
                    {}
                    System.out.print('\u000C');
                }
            }
        }
        System.out.println("Time's Up!");
    }
}
