import java.util.*;
class Shapes
{ 
    public static void main()
    {
        int breadth, height, h, b, l, length;
        double area, perimeter, diagonal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which shape you want:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the desired height of the triangle:");
                int row = sc.nextInt();         
                int i, j, k = 1, w;        
                for (i=0; i<row; i++)   
                {
                    for(w=i;w<row;w++)
                    {
                            System.out.print(" ");
                    }
                    for (j=1; j<=k; j++)   
                    {   
                            System.out.print("*");
                    } 
                    System.out.println();
                    k+=2;
                }
                perimeter = row*3;
                area = (Math.sqrt(3)/4)*row*row;
                System.out.println(" ");
                System.out.println("--------------------------------------------");
                System.out.println("INFORMATION");
                System.out.print("Perimeter:");
                System.out.println(perimeter + " units");
                System.out.print("Area:");
                System.out.println(area + " square units");
                break;
            case 2:
                System.out.println("Enter the desired height of the rectangle:");
                height = sc.nextInt();
                System.out.println("Enter the desired breadth of the rectangle:");
                breadth = sc.nextInt();
                for (h=1; h<=height; h++)
                {
                    for(b=1; b<=breadth; b++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                perimeter = 2*(height+breadth);
                area = height*breadth;
                diagonal = Math.sqrt((height*height)+(breadth*breadth));
                System.out.println(" ");
                System.out.println("--------------------------------------------");
                System.out.println("INFORMATION");
                System.out.print("Perimeter:");
                System.out.println(perimeter + " units");
                System.out.print("Area:");
                System.out.println(area + " square units");
                System.out.print("Diagonal:");
                System.out.println(diagonal + " units");
                break;
            case 3: 
                System.out.println("Enter the desired length of the square:");
                length = sc.nextInt();
                for (l=1; l<=length; l++)
                {
                    for(b=1; b<=length; b++)
                    {
                        System.out.print("*"+"   ");
                    }
                    System.out.println("\n");
                }
                perimeter = 4*length;
                area = length*length;
                diagonal = length*Math.sqrt(2);
                System.out.println(" ");
                System.out.println("--------------------------------------------");
                System.out.println("INFORMATION");
                System.out.print("Perimeter:");
                System.out.println(perimeter + " units");
                System.out.print("Area:");
                System.out.println(area + " square units");
                System.out.print("Diagonal:");
                System.out.println(diagonal + " units");
                break;
        }
    }
}
