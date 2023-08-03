import java.util.Scanner;

public class QwertyKeyboard {
    public static void main(String[] args) {
        // Define the QWERTY keyboard layout
        char[] keyboard = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
        
        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        // Get the input string from the user
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        
        // Convert the input string to lowercase
        userInput = userInput.toLowerCase();
        
        // Initialize the output string
        String output = ""; 
        
        // Loop through each character in the input string
        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            
            // Find the index of the character in the keyboard array
            int index = new String(keyboard).indexOf(c);
            
            // Append the next character in the keyboard to the output string
            output += keyboard[(index + 1) % keyboard.length];
        }
        
        // Print the output string
        System.out.println("Output: " + output);
    }
}
