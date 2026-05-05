package BloodBankManagement;

public class BloodStock {
	 private String bloodGroup;
	    private int unitsAvailable;

	    public BloodStock(String bloodGroup, int unitsAvailable) {
	        this.bloodGroup = bloodGroup;
	        this.unitsAvailable = unitsAvailable;
	    }

	    public void increaseStock(int units) {
	        unitsAvailable += units;
	    }

	    public void decreaseStock(int units) {
	        if (unitsAvailable >= units)
	            unitsAvailable -= units;
	        else
	            System.out.println("Not enough stock!");
	    }

	    public int getUnitsAvailable() {
	        return unitsAvailable;
	    }

	    public String getBloodGroup() {
	        return bloodGroup;
	    }
}

