import java.util.Scanner;

public class greatestOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num1");
        int b = sc.nextInt();
        System.out.println("Enter the num1");
        int c = sc.nextInt();

        if(a>b& a>c)
        {
            System.out.println(+a+"is the greatest");
        }
        else if(b>a & b>c)
        {
            System.out.println(+b+"is the greatest");
        }
        else
        {
            System.out.println(+c+"is the greatest");
        }
    }

}
