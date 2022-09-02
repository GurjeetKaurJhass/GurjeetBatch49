import java.util.Scanner;

public class VowelsComponents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input alphabet between A-Z or a-z");
        String input= sc.next().toLowerCase();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0)<=90;
        boolean lowercase = input.charAt(0) >= 67 && input.charAt(0)<=122;
        boolean vowels = input.equals("a") || input.equals("e")||input.equals("i")||
        input.equals("o")||input.equals("u");
        if(input.length()>1)
        {
            System.out.println("Error.Not a Single character");
        }
        else if(!(uppercase||lowercase))
        {
            System.out.println("Error.not a letter");
        }
        else if(vowels)
        {
            System.out.println("Input letter is a vowel");
        }
        else
        {
            System.out.println("Input letter is a consolent");
        }

    }
}
