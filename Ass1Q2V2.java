import java.util.Scanner; // Import Scanner class for user input

public class Ass1Q2V2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        String MenuOption;
        int marks = 0,  totalmarks = 0,  NumberOfStudents = 0;
        int[] GradeCount;
        GradeCount = new int[5];
        double average;
        
        System.out.println("~x{GRADE EVALUATION}x~");

        while (true)
        {
            System.out.println("________________");
            System.out.println("~{MAIN MENU}~");
            System.out.println("[1] Input Grades");
            System.out.println("[2] Summary");
            System.out.println("[3] Exit");
            System.out.println("________________");
            System.out.print("Input: ");

            MenuOption = scanner.nextLine();
            if(MenuOption.equals("1"))
            {
                while (true) 
                { // Loop to validate and get marks input
                    System.out.println("_______________________________________________________________________________________");
                    System.out.print("Enter marks: ");
                    
                    if (scanner.hasNextInt()) { // Check if input is an integer
                        marks = scanner.nextInt();
                        if (marks >= 0 && marks <= 100) { // Validate mark range
                            break; // Exit loop if valid
                        } 
                        else 
                        {
                            System.out.println("Marks must within the range of 0 - 100.");
                        }
                    } else 
                    {
                        System.out.println("Marks has to be an integer number.");
                        scanner.next(); // Consume the next input from user to recheck in the while-loop conditions
                    }
                }

                if (marks >= 90 && marks <= 100) 
                { // Determine grade and display appropriate messages
                    System.out.println("[Grade A]");
                    System.out.println("Note: Excellent job! Keep up the great effort.");
                    GradeCount[0]++;
                }
                else if (marks >= 80 && marks <= 89) 
                {
                    System.out.println("[Grade B]");
                    System.out.println("Note: Excellent job! Keep up the great effort.");
                    GradeCount[1]++;
                }
                else if (marks >= 70 && marks <= 79) 
                {
                    System.out.println("[Grade C]");
                    System.out.println("Suggestion: Practice more questions to strengthen your understanding.");
                    GradeCount[2]++;
                }
                else if (marks >= 60 && marks <= 69) 
                {
                    System.out.println("[Grade D]");
                    System.out.println("Suggestion: Practice more questions to strengthen your understanding.");
                    GradeCount[3]++;
                }
                else 
                {
                    System.out.println("[Failed]");
                    System.out.println("Suggestion: Consider reviewing the material and retaking the subject, you can do this.");
                    GradeCount[4]++;
                }

                System.out.println("_______________________________________________________________________________________");
                scanner.nextLine();
                System.out.println("Press [Enter] to continue...");
                scanner.nextLine();

                NumberOfStudents++; // Increase student count
                totalmarks += marks; // Add to total marks
            }
            else if (MenuOption.equals("2"))
            {
                if (NumberOfStudents == 0)
                {
                    System.out.println("There are no grades recorded.\nPress [Enter] to continue...");
                    scanner.nextLine();
                }
                else
                {
                    average = (double) totalmarks / NumberOfStudents; // Calculate average marks
                    System.out.println("\n________________________________________");
                    System.out.println("Total students: " + NumberOfStudents);
                    System.out.println("Total marks: " + totalmarks);
                    System.out.println("Students in Grade A: " + GradeCount[0]);
                    System.out.println("Students in Grade B: " + GradeCount[1]);
                    System.out.println("Students in Grade C: " + GradeCount[2]);
                    System.out.println("Students in Grade D: " + GradeCount[3]);
                    System.out.println("Students who failed: " + GradeCount[4]);
                    System.out.println("Average marks: " + String.format("%.2f", average)); // Display average to 2 decimal places
                    System.out.println("---------------------------------------");
                    System.out.println("Press [Enter] to continue...");
                    scanner.nextLine();
                }
            }
            else if (MenuOption.equals("3"))
            {
                System.out.println("\n~{Thank you for using Grade Evaluation program <3}~");
                break;
            }
            else
            {
                System.out.println("'" + MenuOption + "' is not a valid input");
            }
        }
        scanner.close();
    }
}