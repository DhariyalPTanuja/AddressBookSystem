package com.adddresscontactbooksystem;

public class PersonalInfo {
    private String fName ;
    private String lName;
    private long phoneNumber;
    private String email;
    private String state;
    private String city;
    private int zipCode;

    public PersonalInfo(String fName, String lName, long phoneNumber, String email, String state, String city, int zipCode) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}