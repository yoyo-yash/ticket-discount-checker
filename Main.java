import java.util.Scanner; // importing scanner
class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // set up scanner object
    
        // defining variables
        Boolean IsStudent;
        Boolean IsMember;
        double Price = 10.0;

        System.out.println("Welcome to city cinema!");

        System.out.print("Are you a student? (true/false) : "); // Inputs if student or not
        IsStudent = scanner.nextBoolean();

        System.out.print("Are you a member? (true or false): "); // Inputs if member or not
        IsMember = scanner .nextBoolean();

        if(IsStudent){ //Checks if IsStudent
            System.out.println("You're eligible for a 10% student discount!");
            Price *= 0.9; // applies 10% discount
            
            if(IsMember){ // Checks if also IsMember
                System.out.println("You're also eligible for a 15% member discount!");
                Price *= 0.85; // applies another 15% discount on new amount
            }
        }
        else if (IsMember){ // Checks if IsMember only
            System.out.println("You're eligible for a 15% member discount!");
            Price *= 0.85; // applies 15% discount
        }
        else{
            System.out.println("Sorry! you're not eligible for discounts.");
            Price *=1; // no discounts
        }

        System.out.printf("Your total is $%.2f", Price); // prints final price

        scanner.close(); // close scanner

    }
}