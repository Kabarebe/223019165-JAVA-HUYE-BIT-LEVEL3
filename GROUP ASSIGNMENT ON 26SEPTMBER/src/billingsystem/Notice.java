package billingsystem;
import java.time.LocalDate;

public class Notice {

	    private int noticeID;
	    private String noticeNumber;
	    private double amount;
	    private LocalDate dueDate;
	    private String paymentMethod;
	    private String status;
	    private int splyID;
	    
	    public Notice() {}
	    
	    public Notice(String noticeNumber, double amount, LocalDate dueDate, 
	                 String paymentMethod, String status, int splyID) {
	        this.noticeNumber = noticeNumber;
	        this.amount = amount;
	        this.dueDate = dueDate;
	        this.paymentMethod = paymentMethod;
	        this.status = status;
	        this.splyID = splyID;
	    }
	    
	    // Getters and Setters
	    public int getNoticeID() { return noticeID; }
	    public void setNoticeID(int noticeID) { this.noticeID = noticeID; }
	    
	    public String getNoticeNumber() { return noticeNumber; }
	    public void setNoticeNumber(String noticeNumber) { this.noticeNumber = noticeNumber; }
	    
	    public double getAmount() { return amount; }
	    public void setAmount(double amount) { this.amount = amount; }
	    
	    public LocalDate getDueDate() { return dueDate; }
	    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
	    
	    public String getPaymentMethod() { return paymentMethod; }
	    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
	    
	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	    
	    public int getSplyID() { return splyID; }
	    public void setSplyID(int splyID) { this.splyID = splyID; }
	    
	    @Override
	    public String toString() {
	        return "Notice{noticeID=" + noticeID + ", noticeNumber='" + noticeNumber + 
	               "', amount=" + amount + ", dueDate=" + dueDate + "}";
	    }
}
