package billingsystem;
import java.time.LocalDate;

public class BillingCycle {

	    private int billingID;
	    private String cycleName;
	    private String cycleType;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    private String status;
	    private int customerID;
	    
	    public BillingCycle() {}
	    
	    public BillingCycle(String cycleName, String cycleType, LocalDate startDate, 
	                       LocalDate endDate, String status, int customerID) {
	        this.cycleName = cycleName;
	        this.cycleType = cycleType;
	        this.startDate = startDate;
	        this.endDate = endDate;
	        this.status = status;
	        this.customerID = customerID;
	    }
	    
	    // Getters and Setters
	    public int getBillingID() { return billingID; }
	    public void setBillingID(int billingID) { this.billingID = billingID; }
	    
	    public String getCycleName() { return cycleName; }
	    public void setCycleName(String cycleName) { this.cycleName = cycleName; }
	    
	    public String getCycleType() { return cycleType; }
	    public void setCycleType(String cycleType) { this.cycleType = cycleType; }
	    
	    public LocalDate getStartDate() { return startDate; }
	    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
	    
	    public LocalDate getEndDate() { return endDate; }
	    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
	    
	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	    
	    public int getCustomerID() { return customerID; }
	    public void setCustomerID(int customerID) { this.customerID = customerID; }
	    
	    @Override
	    public String toString() {
	        return "BillingCycle{billingID=" + billingID + ", cycleName='" + cycleName + 
	               "', cycleType='" + cycleType + "', status='" + status + "'}";
	    }
}
