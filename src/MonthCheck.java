import java.util.Scanner;

public class MonthCheck {
    public void monthCheck(int month){

        if(month==1||month==3||month==5||month==7||month==9||month==11)
        {
            System.out.println(" Number of days is 31 days");
        }
        else if(month==4||month==6||month==8||month==10||month==12)
        {
            System.out.println("number of days is 30");
        }
        else if(month==2)
        {
            System.out.println("number of days is 28");
        }
        else
        {
            System.out.println("number of days is 28");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month=  sc.nextInt();
        MonthCheck demo = new MonthCheck();
        demo.monthCheck(month);
    }
}

