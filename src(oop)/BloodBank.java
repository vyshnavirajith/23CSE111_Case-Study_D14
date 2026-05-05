package BloodBankManagement;

import java.io.FileWriter;
import java.io.IOException;

public class BloodBank extends User {

    private String bloodBankName;
    private String location;
    private Donor[] donorList;
    private BloodStock[] stockList;
    private int donorCount = 0;
    private int stockCount = 0;

    public BloodBank(int userId, String username, String password,
                     String name, String location, int capacity) {

        super(userId, username, password, "Admin");

        this.bloodBankName = name;
        this.location = location;
        donorList = new Donor[capacity];
        stockList = new BloodStock[10];
    }

    public void displayRole() {
        System.out.println("Role: Blood Bank Admin");
    }

    public void registerDonor(Donor d) {

        if (donorCount < donorList.length) {
            donorList[donorCount++] = d;

            try {
                FileWriter fw = new FileWriter("donors.txt", true); // FIXED

                fw.write(d.getDonorId() + "," + d.getName() + "\n");

                fw.close();

            } catch (IOException e) {
                System.out.println("Error saving donor");
            }

        } else {
            System.out.println("Donor list full!");
        }
    }

    public Donor searchDonor(int id) {
        for (int i = 0; i < donorCount; i++) {
            if (donorList[i].getDonorId() == id)
                return donorList[i];
        }
        return null;
    }

    public void updateBloodStock(BloodStock b) {
        stockList[stockCount++] = b;
    }

    public void viewBloodStock() {
        for (int i = 0; i < stockCount; i++) {
            System.out.println(stockList[i].getBloodGroup()
                    + " : " + stockList[i].getUnitsAvailable());
        }
    }
}