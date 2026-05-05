package BloodBankManagement;

public class Donor {
	 private int donorId;
	    private String name;
	    private String bloodGroup;
	    private int age;
	    private String gender;
	    private String phoneNo;
	    private String address;

	    public Donor(int donorId, String name, String bloodGroup,
	                 int age, String gender, String phoneNo, String address) {

	        this.donorId = donorId;
	        this.name = name;
	        this.bloodGroup = bloodGroup;
	        this.age = age;
	        this.gender = gender;
	        this.phoneNo = phoneNo;
	        this.address = address;
	    }

	    public void addDonor() {
	        System.out.println("Donor added: " + name);
	    }

	    public void updateDonor(String phone, String addr) {
	        phoneNo = phone;
	        address = addr;
	    }

	    public void deleteDonor() {
	        System.out.println("Donor removed: " + name);
	    }

	    public int getDonorId() {
	        return donorId;
	    }

	    public String getName() {
	        return name;
	    }
	
}
