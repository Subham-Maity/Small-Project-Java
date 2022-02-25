

/*It should contain at least one capital case letter.

It should contain at least one lower-case letter.

It should contain at least one number.

Length should be 8 characters.

It should contain one of the following special characters: @, $, #, !.
*/
import java.util.Random;
import java.util.Scanner;

public class Automated_Password_Generator_CodeXam{
    public static void main(String[] args) { //main method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password Length");
        int length = sc.nextInt();
        System.out.println("Your Password is: ");
        System.out.println(generatePassword(length)); //call the generatePassword function
    }

    private static char[] generatePassword(int length) { //generatePassword function
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Capital Later
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";//Small Later
        String specialCharacters = "!@#$";//Special Character
        String numbers = "1234567890"; //number
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;  //Combined here Capital Later +  Small Later + Special Character + number
        Random random = new Random(); //random method
        char[] password = new char[length];//char array and you can put any length

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())); // Char 0 store random lowerCaseLetters
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));// Char 1 store random Capital Letters
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));// Char 2 store random specialCharacters
        password[3] = numbers.charAt(random.nextInt(numbers.length()));// Char 3 store random numbers

        for(int i = 4; i< length ; i++) { // iterate 4 to your entered length
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));//after password[3] random process will happen for remain length
        }
        return password;//now simple return the password
    }
}