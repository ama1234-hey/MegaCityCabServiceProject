package com.example.megacitycab.models;

public class User {
    private int id;
    private String username; // For Admin
    private String email; // Common for Admin & Customer
    private String password;
    private String nic; // For Customer
    private String name; // For Customer
    private String phoneNumber; // For Customer
    private String userType; // "admin" or "customer"

    // Constructors
    public User() {}

    // Admin Constructor
    public User(int id, String username, String email, String password, String userType) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    // Customer Constructor
    public User(int id, String nic, String name, String email, String phoneNumber, String password, String userType) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userType = userType;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getNic() { return nic; }
    public void setNic(String nic) { this.nic = nic; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }
}
