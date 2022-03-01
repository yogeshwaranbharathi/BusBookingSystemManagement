import java.util.ArrayList;
import java.util.Scanner;

public class BusBooking {
    String bname;
    String CustomerName;
    String gender;
    int Age;
    int bookingNo;
    int totalamt;

    BusBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        CustomerName = sc.nextLine();
        System.out.println("Enter Your Age: ");
        Age = sc.nextInt();
        System.out.println("Gender: ");
        gender = sc.next();
        System.out.println("Enter busName: ");
        bname = sc.next();
    }

}