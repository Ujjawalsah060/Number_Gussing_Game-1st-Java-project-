import java.util.Scanner;

public class Pro_1_NumberGussing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable declaration
        int secreteNo = 48;
        int guessNo;
        int choice;

     do{
        System.out.println("==========================================================================");
        System.out.println(".......NUMBER GUESSING GAME CHALENGE.....................");
         System.out.println("==========================================================================");
         System.out.println("1.play game");
         System.out.println("2.Exit game");
         System.out.println("Enter your guess:");
         choice = sc.nextInt();
         switch(choice){
            case 1:
                System.out.println("Guess the number between 1 to 100");
                guessNo = sc.nextInt();
                 CheckGuess(secreteNo, guessNo);// function calling of check guess
                 break;
            case 2:
                System.out.println("Thank you for playing game");
                break;
            default:
                System.out.println("Invalid choice! please enter 1 or 2");
                break;
         }

     } while(choice != 2);
          sc.close();
     }

     
    

    // Function to check the guessed number
    static void CheckGuess(int secreteNo, int guessNo) {

        if (guessNo == secreteNo) {
            System.out.println("Congratulations! Your guess is correct.");
        } else if (guessNo > secreteNo) {
            System.out.println("Your number is too high! Please try again.");
        } else {
            System.out.println("Your number is too low! Better luck next time.");
        }
    }
}
