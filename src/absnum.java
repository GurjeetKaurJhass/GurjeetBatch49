import java.util.Scanner;

public class absnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        Double num = sc.nextDouble();

        if(num>0) {
            if (num < 1) {
                System.out.println(+num + "is positive small number");
            } else if (num > 100000) {
                System.out.println(+num + "is the positive large number");
            } else {
                System.out.println(+num + "is the positive");
            }
        }
        else if(num<0){
            if(Math.abs(num)<1){
                System.out.println(+num + "is negative small number");
            } else if (Math.abs(num)>100000) {
                System.out.println(+num + "is the negative large number");
            } else {
                System.out.println(+num + "is the negative");
            }
        }

    }
}
