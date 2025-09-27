package billingsystem;
import java.time.LocalDateTime;
public class WaterConsumed {
	
	    private int cnsID;
	    private String meterCategory;
	    private String cnsDetails;
	    private String meterReader;
	    private String location;
	    private LocalDateTime createdAt;
	    private int billingID;
	    
	    public WaterConsumed() {}
	    
	    public WaterConsumed(String meterCategory, String cnsDetails, String meterReader, 
	                        String location, int billingID) {
	        this.meterCategory = meterCategory;
	        this.cnsDetails = cnsDetails;
	        this.meterReader = meterReader;
	        this.location = location;
	        this.billingID = billingID;
	    }
	    
	    // Getters and Setters
	    public int getCnsID() { return cnsID; }
	    public void setCnsID(int cnsID) { this.cnsID = cnsID; }
	    
	    public String getMeterCategory() { return meterCategory; }
	    public void setMeterCategory(String meterCategory) { this.meterCategory = meterCategory; }
	    
	    public String getCnsDetails() { return cnsDetails; }
	    public void setCnsDetails(String cnsDetails) { this.cnsDetails = cnsDetails; }
	    
	    public String getMeterReader() { return meterReader; }
	    public void setMeterReader(String meterReader) { this.meterReader = meterReader; }
	    
	    public String getLocation() { return location; }
	    public void setLocation(String location) { this.location = location; }
	    
	    public LocalDateTime getCreatedAt() { return createdAt; }
	    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
	    
	    public int getBillingID() { return billingID; }
	    public void setBillingID(int billingID) { this.billingID = billingID; }
	    
	    @Override
	    public String toString() {
	        return "WaterConsumed{cnsID=" + cnsID + ", meterCategory='" + meterCategory + 
	               "', meterReader='" + meterReader + "', location='" + location + "'}";
	    }
}
