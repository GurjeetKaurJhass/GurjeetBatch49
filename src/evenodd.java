import java.util.Scanner;

public class evenodd {
    public void evenOddCal(int num){
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
    public void inRange(int num)
    {
        if(num>=50 && num<=100)
        {
            System.out.println(num+"is within the range");
        }
        else
            {
            System.out.println(num + "is NOT within the range");
           }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number=  sc.nextInt();
        evenodd demo = new evenodd();
        demo.evenOddCal(number);
        demo.inRange(number);
    }
}
