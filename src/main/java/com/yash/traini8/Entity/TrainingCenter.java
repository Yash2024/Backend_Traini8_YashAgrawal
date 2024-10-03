package com.yash.traini8.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "training_centers")  // This annotation defines the MongoDB collection name
public class TrainingCenter {

    @Id  // MongoDB's unique identifier
    private String id;
    private String centerName;
    private String centerCode;
    private Address address;
    private int studentCap;
    private List<String> coursesOffered;
    private Long createdOn;
    private String contactEmail;
    private String contactPhone;

    public TrainingCenter(String id, String centerName, String centerCode, Address address, int studentCap,
                          List<String> coursesOffered, Long createdOn, String contactEmail, String contactPhone) {
        this.id = id;
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentCap = studentCap;
        this.coursesOffered = coursesOffered;
        this.createdOn = createdOn;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentCap() {
        return studentCap;
    }

    public void setStudentCap(int studentCap) {
        this.studentCap = studentCap;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    // Address class as a static inner class
    public static class Address {
        private String detailedAddress;
        private String city;
        private String state;
        private String pincode;

        public Address(String detailedAddress, String city, String state, String pincode) {
            this.detailedAddress = detailedAddress;
            this.city = city;
            this.state = state;
            this.pincode = pincode;
        }

        // Getters and Setters
        public String getDetailedAddress() {
            return detailedAddress;
        }

        public void setDetailedAddress(String detailedAddress) {
            this.detailedAddress = detailedAddress;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }
    }
}
