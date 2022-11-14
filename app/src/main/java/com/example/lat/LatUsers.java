package com.example.lat;

public class LatUsers {
    private String name, stream, mobile_no;

    public LatUsers() {
    }

    public LatUsers(String name, String stream, String mobile_no) {
        this.name = name;
        this.stream = stream;
        this.mobile_no = mobile_no;
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

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}
