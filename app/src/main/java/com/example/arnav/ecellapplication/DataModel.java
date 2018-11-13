package com.example.arnav.ecellapplication;

public class DataModel {

    String name;
    String dept;
    int id_;
    int image;

    public DataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.dept = version;
        this.id_ = id_;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return dept;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}