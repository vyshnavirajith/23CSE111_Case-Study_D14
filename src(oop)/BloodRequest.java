package BloodBankManagement;

import java.io.FileWriter;
import java.io.IOException;
public class BloodRequest {
	 private int requestId;
	    private String patientName;
	    private String bloodGroup;
	    private int unitsRequired;
	    private String hospitalName;
	    private String requestDate;
	    private String status;

	    public BloodRequest(int requestId, String patientName,
	                        String bloodGroup, int unitsRequired,
	                        String hospitalName, String requestDate) {

	        this.requestId = requestId;
	        this.patientName = patientName;
	        this.bloodGroup = bloodGroup;
	        this.unitsRequired = unitsRequired;
	        this.hospitalName = hospitalName;
	        this.requestDate = requestDate;
	        status = "Pending";
	    }
	    public void createRequest() {

	        System.out.println("Blood request created.");

	        try {
	            FileWriter fw = new FileWriter("C:\\OOPproject\\Files\\requests.txt", true);

	            fw.write(patientName + "," + bloodGroup + "," 
	                     + unitsRequired + "," + hospitalName + "," 
	                     + requestDate + ",Pending\n");

	            fw.close();

	        } catch (IOException e) {
	            System.out.println("Error saving request");
	        }}

	    public void approveRequest() {
	        status = "Approved";
	    }

	    public void cancelRequest() {
	        status = "Cancelled";
	    }
}

