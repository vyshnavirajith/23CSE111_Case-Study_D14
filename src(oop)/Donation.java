package BloodBankManagement;
import java.io.FileWriter;
import java.io.IOException;

public class Donation {

    private int donationId;
    private Donor donor;
    private String bloodGroup;
    private String donationDate;
    private int quantity;

    public Donation(int donationId, Donor donor,
                    String bloodGroup, String donationDate, int quantity) {

        this.donationId = donationId;
        this.donor = donor;
        this.bloodGroup = bloodGroup;
        this.donationDate = donationDate;
        this.quantity = quantity;
    }

    public void recordDonation() {
        System.out.println("Donation Recorded Successfully!");

        try {
            FileWriter fw = new FileWriter("donations.txt", true); // FIXED

            fw.write(donor.getName() + "," + bloodGroup + ","
                    + quantity + "," + donationDate + "\n");

            fw.close();

        } catch (IOException e) {
            System.out.println("Error saving donation");
        }
    }

    public void getDonationDetails() {
        System.out.println("Donation ID: " + donationId);
        System.out.println("Donor Name: " + donor.getName());
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Date: " + donationDate);
        System.out.println("Units: " + quantity);
    }
}