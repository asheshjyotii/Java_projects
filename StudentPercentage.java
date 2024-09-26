import java.util.Scanner;
public class StudentPercentage {
    public static void main(String args[])
    {
        // Subject 1 marks
        System.out.println("Enter marks for Subject 1 :");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();

        // Subject 2 marks
        System.out.println("Enter marks for Subject 2 :");
        int sub2 = sc.nextInt();

        // Subject 3 marks
        System.out.println("Enter marks for Subject 3 :");
        int sub3 = sc.nextInt();

        // Subject 4 marks
        System.out.println("Enter marks for Subject 4 :");
        int sub4 = sc.nextInt();

        // Subject 5 marks
        System.out.println("Enter marks for Subject 5 :");
        int sub5 = sc.nextInt();
        
        double percentage = ((sub1+sub2+sub3+sub4+sub5)*100)/500;
        System.out.println(percentage);

        System.out.println("The secured percentage is: "+percentage);
    }
}