import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int numSubjects = sc.nextInt();
        int arr[] = new int[numSubjects];


        System.out.println("Enter the marks in each subject");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        ArrayDemo ad = new ArrayDemo();
        ad.totalSubjects(arr);
    }


    public void totalSubjects(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("sum is" + sum);

    }
}
