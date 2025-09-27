package billingsystem;
import java.time.LocalDateTime;

public class user {
	
	    private int userID;
	    private String username;
	    private String passwordHash;
	    private String role;
	    private String email;
	    private LocalDateTime createdAt;
	    
	    public User() {}
	    
	    public User(String username, String passwordHash, String role, String email) {
	        this.username = username;
	        this.passwordHash = passwordHash;
	        this.role = role;
	        this.email = email;
	    }
	    
	    // Getters and Setters
	    public int getUserID() { return userID; }
	    public void setUserID(int userID) { this.userID = userID; }
	    
	    public String getUsername() { return username; }
	    public void setUsername(String username) { this.username = username; }
	    
	    public String getPasswordHash() { return passwordHash; }
	    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
	    
	    public String getRole() { return role; }
	    public void setRole(String role) { this.role = role; }
	    
	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }
	    
	    public LocalDateTime getCreatedAt() { return createdAt; }
	    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
	    
	    @Override
	    public String toString() {
	        return "User{userID=" + userID + ", username='" + username + "', role='" + role + "', email='" + email + "'}";
	    }
}
