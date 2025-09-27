package billingsystem;
import java.time.LocalDateTime;

public class Customer {
	
	    private int customerID;
	    private String name;
	    private String description;
	    private String address;
	    private String email;
	    private LocalDateTime createdAt;
	    
	    public Customer() {}
	    
	    public Customer(String name, String description, String address, String email) {
	        this.name = name;
	        this.description = description;
	        this.address = address;
	        this.email = email;
	    }
	    
	    // Getters and Setters
	    public int getCustomerID() { return customerID; }
	    public void setCustomerID(int customerID) { this.customerID = customerID; }
	    
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
	    
	    public String getDescription() { return description; }
	    public void setDescription(String description) { this.description = description; }
	    
	    public String getAddress() { return address; }
	    public void setAddress(String address) { this.address = address; }
	    
	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }
	    
	    public LocalDateTime getCreatedAt() { return createdAt; }
	    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
	    
	    @Override
	    public String toString() {
	        return "Customer{customerID=" + customerID + ", name='" + name + "', address='" + address + "', email='" + email + "'}";
	    }
}
