package com.sabin.gmail;

public class mail {
    private String name;
    private String title;
    private String message;
    private String date;
    private int imageId;

    public mail(String name, String title, String message, String date, int imageId) {
        this.name = name;
        this.title = title;
        this.message = message;
        this.date = date;
        this.imageId = imageId;

    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTitle() {return title; }
    public void setTitle(String title) { this.title = title; }

    public String getMessage() {return message;}
    public void setMessage(String message) { this.message = message; }

    public String getDate() {return date;}
    public void setDate(String date) { this.date = date; }

    public int getImageId() {return imageId;}
    public void setImageId(int imageId) { this.imageId = imageId; }
}
