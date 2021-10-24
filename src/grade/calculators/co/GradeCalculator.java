package grade.calculators.co;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        // Taking the marks of the user out of 100

        System.out.println("Welcome to the grade calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks in english");
        float english = sc.nextFloat();
        System.out.println("Enter your marks in hindi");
        float hindi = sc.nextFloat();
        System.out.println("Enter your marks in maths");
        float maths = sc.nextFloat();
        System.out.println("Enter your marks in science");
        float science = sc.nextFloat();
        System.out.println("Enter your marks in sst");
        float sst = sc.nextFloat();
        System.out.println("Enter your marks in IT");
        float it = sc.nextFloat();

        // Getting subject wise percentages
        float engPer = english*100/100;
        System.out.println("Your english percentage is: "+engPer);

        float hinPer = hindi*100/100;
        System.out.println("Your hindi percentage is: "+hinPer);

        float matPer = maths*100/100;
        System.out.println("Your maths percentage is: "+matPer);

        float sciPer = science*100/100;
        System.out.println("Your science percentage is: "+sciPer);

        float sstPer = sst*100/100;
        System.out.println("Your sst percentage is: "+sstPer);

        float itPer = it*100/100;
        System.out.println("Your IT percentage is: "+itPer);

        // Getting the total marks
        float total = english+hindi+maths+science+sst+it;

        // Total Percentage
        float totalPer = total*100/600;
        System.out.println("Your total percentage is: "+totalPer);

        // Getting avg marks
        float avg = total/6;

        // Here starts the main function of grades
        if(avg>=90)
        {
            System.out.println("Congratulations your grade is: A");
        }
        else if(avg>=80)
        {
            System.out.println("Very Good your grade is: B");
        }
        else if(avg>=70)
        {
            System.out.println("Hmm your grade is: C");
        }
        else if(avg>=60)
        {
            System.out.println("Study more harder and score better next time your grade is: D");
        }
        else if(avg<=50)
        {
            System.out.println("Sorry to say but you are failed in this term your grade is: E");
        }



        // main bracket
    }
}