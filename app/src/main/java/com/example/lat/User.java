package com.example.lat;

public class User {
    private String   name;
    private String stream;
    private String district;
    private String locality;
    private String mobile_number;
    private String email;
    private String password;
    private String profile;
    private long coins = 0;





    public User() {
    }

    public User(String name, String stream, String district, String locality, String mobile_number, String email, String password){
        this.name = name;
        this.stream = stream;
        this.district = district;
        this.locality = locality;
        this.mobile_number = mobile_number;
        this.password = password;
        this.email = email;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCoins() { return coins; }

    public void setCoins(long coins) { this.coins = coins; }

    public String getProfile() {return profile;}

    public void setProfile(String profile) { this.profile = profile;}



}
