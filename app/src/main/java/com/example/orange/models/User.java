package com.example.orange.models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("Id")
    int  id;
    @SerializedName("Email")
    String email;
    @SerializedName("FName")
    String first_name;
    @SerializedName("LName")
    String last_name;
    @SerializedName("Age")
    String age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    @SerializedName("Country")
    String country;
    @SerializedName("PhoneNumber")
    String phone_number;


    public User(){}

    public User(int id, String email, String first_name, String last_name, String age, String country, String phone_number) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.country = country;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
