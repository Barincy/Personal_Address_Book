package org.example.entity;

public class Address {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String address;

    public String toString() {
        return "Address{" +
                "id = " + id +
                " , name = " + name +
                " , phoneNumber = " + phoneNumber +
                " , address = " + address +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
