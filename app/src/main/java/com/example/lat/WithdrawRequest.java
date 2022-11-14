package com.example.lat;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class WithdrawRequest {
    private String userId;
    private String mobileNumber;
    private String requestedBy;

    public WithdrawRequest() {

    }

    public WithdrawRequest(String userId, String mobileNumber, String requestedBy) {
        this.userId = userId;
        this.mobileNumber = mobileNumber;
        this.requestedBy = requestedBy;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String emobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    @ServerTimestamp
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
