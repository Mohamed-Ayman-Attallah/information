package com.example.yourinformation;

public class adabter {
    private String title;
    private String Description;
    private String Catagory;
    private int img;

    public adabter(String title, String description, String catagory, int img) {
        this.title = title;
        Description = description;
        Catagory = catagory;
        this.img = img;
    }

    public adabter(String title, String description, int img) {
        this.title = title;
        Description = description;
        this.img = img;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
