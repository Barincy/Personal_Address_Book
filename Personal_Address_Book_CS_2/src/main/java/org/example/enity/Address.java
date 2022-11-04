package org.example.enity;

public class Address {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;

    public String toString() {
        return "PersonalAddress{" +
                " id = " + id +
                " name = " + name +
                " phoneNumber = " + phoneNumber +
                " address = " + address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
