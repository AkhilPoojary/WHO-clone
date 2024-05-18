package org.example;

public class Customer {
    private String name;
    private long mobileNumber;
    private String emial;
    private String idProof;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", emial='" + emial + '\'' +
                ", idProof='" + idProof + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public Customer(String name, long mobileNumber, String emial, String idProof) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emial = emial;
        this.idProof = idProof;
    }
}
