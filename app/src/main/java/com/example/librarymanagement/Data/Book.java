package com.example.librarymanagement.Data;

public class Book {
    private String writer;
    private String address;
    private int cod_book;
    private long isbn;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCod_book() {
        return cod_book;
    }

    public void setCod_book(int cod_book) {
        this.cod_book = cod_book;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}