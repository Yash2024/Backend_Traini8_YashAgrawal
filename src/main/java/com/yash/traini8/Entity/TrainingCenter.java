package com.yash.traini8.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Embedded;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Document(collection = "training_centers")  // This annotation defines the MongoDB collection name
public class TrainingCenter {

    @Id  // MongoDB's unique identifier
    private String id;
    
    @NotBlank(message = "CenterName is required")
    @Size(max = 40, message = "CenterName must be less than 40 characters")
    private String centerName;
    
    @NotBlank(message = "CenterCode is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
    private String centerCode;
    
    @Embedded
    private Address address;
    
    private int studentCap;
    
    private List<String> coursesOffered;
    
    private Long createdOn;
    
    @Email(message = "ContactEmail should be a valid email address")
    private String contactEmail;
    
    @NotBlank(message = "ContactPhone is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "ContactPhone must be a valid 10-digit phone number")
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
    	@NotBlank(message = "Detailed Address is required")
        private String detailedAddress;
    	
    	@NotBlank(message = "City is required")
        private String city;
    	
    	@NotBlank(message = "State is required")
        private String state;
    	
    	@NotBlank(message = "Pincode is required")
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
