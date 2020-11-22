package com.demo.myapp.service.dto;

public class CarDTO {
    private String id;
    private String name;

    public CarDTO() {
        //Empty con needed for jackson
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
}
