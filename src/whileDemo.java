import java.util.Scanner;

public class whileDemo
{
public static void main(String args[]) {
    int random = (int) Math.random() * 10;
    System.out.println(random);
   boolean flag = true;

    Scanner sc = new Scanner(System.in);
    while(flag)
    {
        System.out.println("guess the number");
        int userGuess = sc.nextInt();
        if(random == userGuess)
        {
            System.out.println("your guess is right!!you win");
        }
        else
        System.out.println("your guess was not correct");
    }
}
}
