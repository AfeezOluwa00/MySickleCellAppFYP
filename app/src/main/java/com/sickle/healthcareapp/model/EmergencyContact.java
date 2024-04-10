package com.sickle.healthcareapp.model;

public class EmergencyContact {
    private String name;
    private String phoneNumber;

    public EmergencyContact() {
        // Empty constructor needed for Firestore
    }

    public EmergencyContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
