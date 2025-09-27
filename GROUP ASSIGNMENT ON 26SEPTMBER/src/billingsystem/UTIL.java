package billingsystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Parser.Result;

public class UTIL {

	    public boolean addUser(user user) {
	        String sql = "INSERT INTO User (Username, PasswordHash, Role, Email) VALUES (?, ?, ?, ?)";
	        
	        try (Connection conn = DatabaseConfig.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
	            
	            stmt.setString(1, user.getUsername());
	            stmt.setString(2, user.getPasswordHash());
	            stmt.setString(3, user.getRole());
	            stmt.setString(4, user.getEmail());
	            
	            int affectedRows = stmt.executeUpdate();
	            if (affectedRows > 0) {
	                try (Result generatedKeys = stmt.getGeneratedKeys()) {
	                    if (generatedKeys.next()) {
	                        user.setUserID(generatedKeys.getInt(1));
	                    }
	                }
	                return true;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }
	    
	    public user getUserById(int userID) {
	        String sql = "SELECT * FROM User WHERE UserID = ?";
	        user user = null;
	        
	        try (Connection conn = DatabaseConfig.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            
	            stmt.setInt(1, userID);
	            ResultSet rs = stmt.executeQuery();
	            
	            if (rs.next()) {
	                user = new user();
	                user.setUserID(rs.getInt("UserID"));
	                user.setUsername(rs.getString("Username"));
	                user.setPasswordHash(rs.getString("PasswordHash"));
	                user.setRole(rs.getString("Role"));
	                user.setEmail(rs.getString("Email"));
	                user.setCreatedAt(rs.getTimestamp("CreatedAt").toLocalDateTime());
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return user;
	    }
	    
	    public List<user> getAllUsers() {
	        List<user> users = new ArrayList<>();
	        String sql = "SELECT * FROM User";
	        
	        try (Connection conn = DatabaseConfig.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            
	            while (rs.next()) {
	                user user = new user();
	                user.setUserID(rs.getInt("UserID"));
	                user.setUsername(rs.getString("Username"));
	                user.setPasswordHash(rs.getString("PasswordHash"));
	                user.setRole(rs.getString("Role"));
	                user.setEmail(rs.getString("Email"));
	                user.setCreatedAt(rs.getTimestamp("CreatedAt").toLocalDateTime());
	                users.add(user);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return users;
	    }
	    
	    public boolean updateUser(user user) {
	        String sql = "UPDATE User SET Username=?, PasswordHash=?, Role=?, Email=? WHERE UserID=?";
	        
	        try (Connection conn = DatabaseConfig.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            
	            stmt.setString(1, user.getUsername());
	            stmt.setString(2, user.getPasswordHash());
	            stmt.setString(3, user.getRole());
	            stmt.setString(4, user.getEmail());
	            stmt.setInt(5, user.getUserID());
	            
	            return stmt.executeUpdate() > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	    public boolean deleteUser(int userID) {
	        String sql = "DELETE FROM User WHERE UserID=?";
	        
	        try (Connection conn = DatabaseConfig.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            
	            stmt.setInt(1, userID);
	            return stmt.executeUpdate() > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	    public user getUserByUsername(String username) {
	        String sql = "SELECT * FROM User WHERE Username = ?";
	        user user = null;
	        
	        try (Connection conn = DatabaseConfig.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            
	            stmt.setString(1, username);
	            ResultSet rs = stmt.executeQuery();
	            
	            if (rs.next()) {
	                user = new user();
	                user.setUserID(rs.getInt("UserID"));
	                user.setUsername(rs.getString("Username"));
	                user.setPasswordHash(rs.getString("PasswordHash"));
	                user.setRole(rs.getString("Role"));
	                user.setEmail(rs.getString("Email"));
	                user.setCreatedAt(rs.getTimestamp("CreatedAt").toLocalDateTime());
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return user;
	    }
}
