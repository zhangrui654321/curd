package com.curd.pojo;

import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Books> books;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public List<Books> getBooks() {
        return books;
    }
}
