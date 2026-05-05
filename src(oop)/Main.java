package BloodBankManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BloodBank bb = new BloodBank(1, "admin", "1234",
                "City Blood Bank", "Kochi", 10);

        bb.login("admin", "1234");
        bb.displayRole();

        
        System.out.println("\n--- Enter Donor Details ---");

        System.out.print("Enter Donor ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Blood Group: ");
        String bg = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Donor d = new Donor(id, name, bg, age, gender, phone, address);

        bb.registerDonor(d);

        System.out.println("\n--- Donation Details ---");

        System.out.print("Enter Donation Date (dd-MM-yyyy): ");
        String donationDate = sc.nextLine();

        System.out.print("Enter Quantity (units): ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Donation donation = new Donation(id, d, bg, donationDate, quantity);

        donation.recordDonation();
        donation.getDonationDetails();

        System.out.println("\n--- Blood Request ---");

        System.out.print("Enter Patient Name: ");
        String pname = sc.nextLine();

        System.out.print("Enter Required Blood Group: ");
        String rbg = sc.nextLine();

        System.out.print("Enter Units Required: ");
        int units = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Hospital Name: ");
        String hospital = sc.nextLine();

        System.out.print("Enter Request Date (dd-MM-yyyy): ");
        String date = sc.nextLine();

        BloodRequest req = new BloodRequest(201, pname, rbg,
                units, hospital, date);

        req.createRequest();

        bb.logout();

        sc.close();
    }
}