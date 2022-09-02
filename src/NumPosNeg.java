import java.util.Scanner;
public class NumPosNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int input = sc.nextInt();

        if (input > 0) {
            System.out.println(+input + "Positive num");
        } else if (input < 0) {
            System.out.println(+input + "negative num");
        } else {
            System.out.println(+input + "is zero");
        }
    }
}