package billingsystem;
import java.time.LocalDate;

public class WaterSupply {

	    private int splyID;
	    private String accountNumber;
	    private LocalDate date;
	    private String status;
	    private double monthlyRate;
	    private String notes;
	    private int customerID;
	    
	    public WaterSupply() {}
	    
	    public WaterSupply(String accountNumber, LocalDate date, String status, 
	                      double monthlyRate, String notes, int customerID) {
	        this.accountNumber = accountNumber;
	        this.date = date;
	        this.status = status;
	        this.monthlyRate = monthlyRate;
	        this.notes = notes;
	        this.customerID = customerID;
	    }
	    
	    // Getters and Setters
	    public int getSplyID() { return splyID; }
	    public void setSplyID(int splyID) { this.splyID = splyID; }
	    
	    public String getAccountNumber() { return accountNumber; }
	    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
	    
	    public LocalDate getDate() { return date; }
	    public void setDate(LocalDate date) { this.date = date; }
	    
	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	    
	    public double getMonthlyRate() { return monthlyRate; }
	    public void setMonthlyRate(double monthlyRate) { this.monthlyRate = monthlyRate; }
	    
	    public String getNotes() { return notes; }
	    public void setNotes(String notes) { this.notes = notes; }
	    
	    public int getCustomerID() { return customerID; }
	    public void setCustomerID(int customerID) { this.customerID = customerID; }
	    
	    @Override
	    public String toString() {
	        return "WaterSupply{splyID=" + splyID + ", accountNumber='" + accountNumber + 
	               "', status='" + status + "', monthlyRate=" + monthlyRate + "}";
	    }
}
