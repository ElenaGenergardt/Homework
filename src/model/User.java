package model;

import java.time.LocalDateTime;

public class User {
    private long id;
    private String email;
    private String password;
    private String fullName;
    private Role role;
    private LocalDateTime createdAt;

    public User() {
    }

    public User(LocalDateTime createdAt, String email, String fullName, String password, Role role) {
        this.createdAt = createdAt;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
