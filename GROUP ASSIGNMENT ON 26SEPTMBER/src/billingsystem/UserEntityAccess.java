package billingsystem;
import java.time.LocalDateTime;
public class UserEntityAccess {

	    private int userEntityAccessID;
	    private int userID;
	    private String entityType;
	    private int entityID;
	    private String accessLevel;
	    private LocalDateTime grantedAt;
	    
	    public UserEntityAccess() {}
	    
	    public UserEntityAccess(int userID, String entityType, int entityID, String accessLevel) {
	        this.userID = userID;
	        this.entityType = entityType;
	        this.entityID = entityID;
	        this.accessLevel = accessLevel;
	    }
	    
	    // Getters and Setters
	    public int getUserEntityAccessID() { return userEntityAccessID; }
	    public void setUserEntityAccessID(int userEntityAccessID) { this.userEntityAccessID = userEntityAccessID; }
	    
	    public int getUserID() { return userID; }
	    public void setUserID(int userID) { this.userID = userID; }
	    
	    public String getEntityType() { return entityType; }
	    public void setEntityType(String entityType) { this.entityType = entityType; }
	    
	    public int getEntityID() { return entityID; }
	    public void setEntityID(int entityID) { this.entityID = entityID; }
	    
	    public String getAccessLevel() { return accessLevel; }
	    public void setAccessLevel(String accessLevel) { this.accessLevel = accessLevel; }
	    
	    public LocalDateTime getGrantedAt() { return grantedAt; }
	    public void setGrantedAt(LocalDateTime grantedAt) { this.grantedAt = grantedAt; }
	    
	    @Override
	    public String toString() {
	        return "UserEntityAccess{userEntityAccessID=" + userEntityAccessID + 
	               ", userID=" + userID + ", entityType='" + entityType + 
	               "', entityID=" + entityID + ", accessLevel='" + accessLevel + "'}";
	    }
}
