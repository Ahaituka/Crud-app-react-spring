package com.djamware.react.models;  //declaring the package name

import org.springframework.data.annotation.Id;
// org.springframework.data.annotation.Id is currently used by Spring to
// support mapping for other non relational persistence databases or frameworks that do not have a defined common persistence
// API like JPA. So, it is normally used when dealing with other spring-data projects such as spring-data-mongodb, spring-data-solr, etc.

import org.springframework.data.mongodb.core.mapping.Document;
//Infrastructure for the MongoDB document-to-object mapping subsystem.
// Identifies a domain object to be persisted to MongoDB.






@Document(collection = "contacts") //declaring annotaion of  collection named contacts
public class Contact { //creating class contact
    @Id
    String id;
    String name;
    String address;
    String city;
    String phone;
    String email;
    public Contact() {
    }
    public Contact(String name, String address, String city, String phone, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {  //functions for getting values
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
