package com.se.riddaradb.dtos;

public class SagaDto {

    int id;
    String name;
    int date;

    public SagaDto(int id, String name, int date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
