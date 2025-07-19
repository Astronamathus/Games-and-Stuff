import java.util.*;
class eggjams
{
    public static void main()
    {
        //Declaration
        Scanner sc = new Scanner(System.in);
        int exam, subject, mark, sum = 0, choice, maths, biology, chemistry, elective, physics, history, geography, english_lit, english_lang, second_language;
        double average, percentage;
        String subjects[] = {"Maths", "Biology", "Chemistry", "Physics", "History", "Geography", "English Literature", "English Language", "2nd Language", "Elective"};
        String subject_choice, grade = " ";
        int marks[] = new int[10];
        //Exam choice stuff
        System.out.println("Choose your exam (1 or 2): ");
        System.out.println("1. Unit Test (50 marks)");
        System.out.println("2. Terms/Prelim/Board (80 marks)");
        exam = sc.nextInt();
        switch(exam)
        {
            case 1:
                System.out.println("Choose number of subjects: ");
                System.out.println("1. One subject");
                System.out.println("2. All subjects ");
                subject = sc.nextInt();
                switch(subject)
                {
                    case 1: 
                        System.out.println("What would you like to calculate?: ");
                        System.out.println("1. Percentage");
                        System.out.println("2. Grade");
                        choice = sc.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.println("Enter the desired subject (Please enter one of the below, It'S cAsE SeNsItIvE): ");
                                System.out.println("(Maths, Biology, Chemistry, Physics, History, Geography, English Literature, English Language, 2nd Language, Elective)" );
                                subject_choice = sc.next();
                                for(int i = 0; i < 10; i++)
                                {
                                    if(subject_choice == subjects[i])
                                    {
                                        break;
                                    }
                                }
                                System.out.print("Enter the marks scored in "+subject_choice+": ");
                                mark = sc.nextInt();
                                percentage = (mark/50.0)*100.0;
                                System.out.println("The percentage scored in "+subject_choice+" is: "+percentage+" %");
                                break;
                            case 2:
                                System.out.println("Enter the desired subject (Please enter one of the below, It'S cAsE SeNsItIvE): ");
                                System.out.println("(Maths, Biology, Chemistry, Physics, History, Geography, English Literature, English Language, 2nd Language, Elective)" );
                                subject_choice = sc.next();
                                for(int i = 0; i < 10; i++)
                                {
                                    if(subject_choice == subjects[i])
                                    {
                                        break;
                                    }
                                }
                                System.out.print("Enter the marks scored in "+subject_choice+": ");
                                mark = sc.nextInt();
                                percentage = (mark/50.0)*100.0;
                                if(percentage > 0 && percentage <= 39)
                                {
                                    grade = "D";
                                }
                                else if(percentage > 39 && percentage <= 49)
                                {
                                    grade = "C";
                                }
                                else if(percentage > 49 && percentage <= 59)
                                {
                                    grade = "C+";
                                }
                                else if(percentage > 59 && percentage <= 69)
                                {
                                    grade = "B";
                                }
                                else if(percentage > 69 && percentage <= 79)
                                {
                                    grade = "B+";
                                }
                                else if(percentage > 79 && percentage <= 89)
                                {
                                    grade = "A";
                                }
                                else if(percentage > 89 && percentage <= 100)
                                {
                                    grade = "A+";
                                }
                                System.out.println("Your grade in "+subject_choice+" is: "+grade);                                
                                break;
                        }
                        break;
                    case 2: 
                        System.out.println("What would you like to calculate?: ");
                        System.out.println("1. Percentage");
                        System.out.println("2. Grade");
                        System.out.println("3. Average");
                        choice = sc.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.println("Enter the marks scored in the following subjects: ");
                                for(int i = 0; i < 10; i++)
                                {
                                    System.out.println(subjects[i]+": ");
                                    marks[i] = sc.nextInt();
                                }
                                for(int i = 0; i < 10; i++)
                                {
                                    sum += marks[i];
                                }
                                percentage = (sum/500.0)*100.0;
                                System.out.println("Your percentage is: "+percentage+" %");
                                break;
                            case 2:
                                System.out.println("Enter the marks scored in the following subjects: ");
                                for(int i = 0; i < 10; i++)
                                {
                                    System.out.println(subjects[i]+": ");
                                    marks[i] = sc.nextInt();
                                }
                                for(int i = 0; i < 10; i++)
                                {
                                    sum += marks[i];
                                }
                                percentage = (sum/500.0)*100.0;
                                if(percentage > 0 && percentage <= 39)
                                {
                                    grade = "D";
                                }
                                else if(percentage > 39 && percentage <= 49)
                                {
                                    grade = "C";
                                }
                                else if(percentage > 49 && percentage <= 59)
                                {
                                    grade = "C+";
                                }
                                else if(percentage > 59 && percentage <= 69)
                                {
                                    grade = "B";
                                }
                                else if(percentage > 69 && percentage <= 79)
                                {
                                    grade = "B+";
                                }
                                else if(percentage > 79 && percentage <= 89)
                                {
                                    grade = "A";
                                }
                                else if(percentage > 89 && percentage <= 100)
                                {
                                    grade = "A+";
                                }
                                System.out.println("Your grade is: "+grade);
                                break;
                            case 3: 
                                System.out.println("Enter the marks scored in the following subjects: ");
                                for(int i = 0; i < 10; i++)
                                {
                                    System.out.println(subjects[i]+": ");
                                    marks[i] = sc.nextInt();
                                }
                                for(int i = 0; i < 10; i++)
                                {
                                    sum += marks[i];
                                }
                                average = sum/10.0;
                                System.out.println("The average you scored is: "+average);
                                break;
                        }
                }
                break;
            case 2:
                System.out.println("Choose number of subjects: ");
                System.out.println("1. One subject");
                System.out.println("2. All subjects ");
                subject = sc.nextInt();
                switch(subject)
                {
                    case 1: 
                        System.out.println("What would you like to calculate?: ");
                        System.out.println("1. Percentage");
                        System.out.println("2. Grade");
                        choice = sc.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.println("Enter the desired subject (Please enter one of the below, It'S cAsE SeNsItIvE): ");
                                System.out.println("(Maths, Biology, Chemistry, Physics, History, Geography, English Literature, English Language, 2nd Language, Elective)" );
                                subject_choice = sc.next();
                                for(int i = 0; i < 10; i++)
                                {
                                    if(subject_choice.equals(subjects[i]))
                                    {
                                        break;
                                    }
                                }
                                System.out.print("Enter the marks scored in "+subject_choice+": ");
                                mark = sc.nextInt();
                                if(subject_choice.equals("Elective"))
                                {
                                    percentage = (mark/100.0)*100.0;
                                }
                                else
                                {
                                    percentage = (mark/80.0)*100.0;
                                }
                                System.out.println("The percentage scored in "+subject_choice+" is: "+percentage+" %");
                                break;
                            case 2:
                                System.out.println("Enter the desired subject (Please enter one of the below, It'S cAsE SeNsItIvE): ");
                                System.out.println("(Maths, Biology, Chemistry, Physics, History, Geography, English Literature, English Language, 2nd Language, Elective)" );
                                subject_choice = sc.next();
                                for(int i = 0; i < 10; i++)
                                {
                                    if(subject_choice == subjects[i])
                                    {
                                        break;
                                    }
                                }
                                System.out.print("Enter the marks scored in "+subject_choice+": ");
                                mark = sc.nextInt();
                                percentage = (mark/80.0)*100.0;
                                if(percentage > 0 && percentage <= 39)
                                {
                                    grade = "D";
                                }
                                else if(percentage > 39 && percentage <= 49)
                                {
                                    grade = "C";
                                }
                                else if(percentage > 49 && percentage <= 59)
                                {
                                    grade = "C+";
                                }
                                else if(percentage > 59 && percentage <= 69)
                                {
                                    grade = "B";
                                }
                                else if(percentage > 69 && percentage <= 79)
                                {
                                    grade = "B+";
                                }
                                else if(percentage > 79 && percentage <= 89)
                                {
                                    grade = "A";
                                }
                                else if(percentage > 89 && percentage <= 100)
                                {
                                    grade = "A+";
                                }
                                System.out.println("Your grade in "+subject_choice+" is: "+grade);                                
                                break;
                        }
                        break;
                    case 2: 
                        System.out.println("What would you like to calculate?: ");
                        System.out.println("1. Percentage");
                        System.out.println("2. Grade");
                        System.out.println("3. Average");
                        choice = sc.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.println("Enter the marks scored in the following subjects: ");
                                for(int i = 0; i < 10; i++)
                                {
                                    System.out.println(subjects[i]+": ");
                                    marks[i] = sc.nextInt();
                                }
                                for(int i = 0; i < 10; i++)
                                {
                                    sum += marks[i];
                                }
                                percentage = (sum/900.0)*100.0;
                                System.out.println("Your percentage is: "+percentage+" %");
                                break;
                            case 2:
                                System.out.println("Enter the marks scored in the following subjects: ");
                                for(int i = 0; i < 10; i++)
                                {
                                    System.out.println(subjects[i]+": ");
                                    marks[i] = sc.nextInt();
                                }
                                for(int i = 0; i < 10; i++)
                                {
                                    sum += marks[i];
                                }
                                percentage = (sum/900.0)*100.0;
                                if(percentage > 0 && percentage <= 39)
                                {
                                    grade = "D";
                                }
                                else if(percentage > 39 && percentage <= 49)
                                {
                                    grade = "C";
                                }
                                else if(percentage > 49 && percentage <= 59)
                                {
                                    grade = "C+";
                                }
                                else if(percentage > 59 && percentage <= 69)
                                {
                                    grade = "B";
                                }
                                else if(percentage > 69 && percentage <= 79)
                                {
                                    grade = "B+";
                                }
                                else if(percentage > 79 && percentage <= 89)
                                {
                                    grade = "A";
                                }
                                else if(percentage > 89 && percentage <= 100)
                                {
                                    grade = "A+";
                                }
                                System.out.println("Your grade is: "+grade);
                                break;
                            case 3: 
                                System.out.println("Enter the marks scored in the following subjects: ");
                                for(int i = 0; i < 10; i++)
                                {
                                    System.out.println(subjects[i]+": ");
                                    marks[i] = sc.nextInt();
                                }
                                for(int i = 0; i < 10; i++)
                                {
                                    sum += marks[i];
                                }
                                average = sum/10.0;
                                System.out.println("The average you scored is: "+average);
                                break;
                        }
                }
                break;
        }
    }
}
