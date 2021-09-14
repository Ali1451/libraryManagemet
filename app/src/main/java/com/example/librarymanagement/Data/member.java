package com.example.librarymanagement.Data;

public class member {
    private String name_member;
    private String address_member;
    private long phone_number;
    private long cod_melly;

    public String getName_member() {
        return name_member;
    }

    public void setName_member(String name_member) {
        this.name_member = name_member;
    }

    public String getAddress_member() {
        return address_member;
    }

    public void setAddress_member(String address_member) {
        this.address_member = address_member;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public long getCod_melly() {
        return cod_melly;
    }

    public void setCod_melly(long cod_melly) {
        this.cod_melly = cod_melly;
    }
}