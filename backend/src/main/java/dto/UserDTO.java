package dto;

import entity.User;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class UserDTO implements Serializable {
    private UUID id;
    private String username;
    private String email;
    private String passwordHash;
    private String googleId;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;

    public UserDTO() {}

    public UserDTO(UUID id, String username, String email, String passwordHash, String googleId, LocalDateTime createdAt, LocalDateTime lastLogin) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.googleId = googleId;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
    }

    public static UserDTO fromEntity(User u) {
        if (u == null) return null;
        return new UserDTO(u.getId(), u.getUsername(), u.getEmail(), u.getPasswordHash(), u.getGoogleId(), u.getCreatedAt(), u.getLastLogin());
    }

    public User toEntity() {
        User u = new User();
        u.setId(this.id);
        u.setUsername(this.username);
        u.setEmail(this.email);
        u.setPasswordHash(this.passwordHash);
        u.setGoogleId(this.googleId);
        u.setCreatedAt(this.createdAt);
        u.setLastLogin(this.lastLogin);
        return u;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public String getGoogleId() { return googleId; }
    public void setGoogleId(String googleId) { this.googleId = googleId; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getLastLogin() { return lastLogin; }
    public void setLastLogin(LocalDateTime lastLogin) { this.lastLogin = lastLogin; }
}
