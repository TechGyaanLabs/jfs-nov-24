package com.careerit.cj.cbook;

import java.time.LocalDate;


public class Contact {

    private String id;
    private String name;
    private String email;
    private String mobile;
    private String city;

    public Contact() {
        if (id == null || id.isEmpty()) {
            id = IdGenerator.getNewId();
        }
    }

    public Contact(String name, String email, String mobile, String city) {
        this();
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.city = city;
    }

    public String getId() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
