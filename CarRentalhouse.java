package Taskprograms;
import java.util.Scanner;

public class CarRentalhouse {

    int days;
    double rent = 1500;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        companyName();

        CarRentalhouse c1 = new CarRentalhouse();

        c1.dailyrent();

        System.out.println("Enter no. of days:");
        c1.days = sc.nextInt();
        c1.days();

        System.out.println("Enter insurance money:");
        double insurenceamount = sc.nextDouble();

        c1.insurence(insurenceamount);

        double baserent = c1.baseRental();

        c1.totalAmount(baserent, insurenceamount);

        sc.close();
    }

    static void companyName() {
        System.out.println("Welcome to VCube Car Rental House");
    }

    void days() {
        System.out.println("No. of days: " + days);
    }

    void dailyrent() {
        System.out.println("Rent per day = " + rent);
    }

    double baseRental() {
        double baserent = days * rent;

        System.out.println("Base rent for " + days
                + " days is = " + baserent);

        return baserent;
    }

    void insurence(double insurenceamount) {
        System.out.println("Insurance amount = " + insurenceamount);
    }

    void totalAmount(double baserent, double insurenceamount) {

        double totalamount = baserent + insurenceamount;

        System.out.println("Total Amount = " + totalamount);
    }
}
