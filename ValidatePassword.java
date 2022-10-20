import java.util.Scanner;
import java.util.regex.*;

public class ValidatePassword {

    public static boolean isGoodLength(String password) {
        if (password.length()< 8 || password.length() > 16){
            return false;
        }
        return true;
    }

    public static boolean isSymbol(String password) {
        
        // Regex to check valid password.
        String regex = ".*[~!@#$%^&*()=+_-].*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);

        return m.matches();
    }

    public static boolean isUpperCase(String password) {

        // Regex to check valid password.
        String regex = ".*[A-Z].*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);

        return m.matches();
    }

    public static boolean isLowerCase(String password) {

        // Regex to check valid password.
        String regex = ".*[a-z].*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);

        return m.matches();
    }

    public static boolean isDigit(String password) {

        // Regex to check valid password.
        String regex = ".*[0-9].*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);

        return m.matches();
    }

    // Driver Code.
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Please enter your password:");
        String str = scanner.nextLine();
        str = str.replace(" ", "");

        if (isGoodLength(str) == false){
            System.out.println("Invalid Password");
            System.out.println("Password length must be between 8 and 16 characters");
        }else {
            if(isDigit(str) == true) {
                count++;
            }
            if(isLowerCase(str) == true) {
                count++;
            }
            if(isUpperCase(str) == true) {
                count++;
            }
            if(isSymbol(str) == true){
                count++;
            }

       if(count >= 3) {
            System.out.println("Valid Password");
        }else{
        System.out.println("Invalid Password. Password must satisfy 3 out of the 4 following requirements: at least one digit,"
                                    + " one lower case letter, one upper case letter, one symbol.");
        }
        }
        scanner.close();
    }
}
