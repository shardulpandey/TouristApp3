package com.ggi.touristapp;

public class place {

    private int image;
    private String NameOfPlace;
    private String DescriptionOfPlace;

    public place(int imageRes, String name, String Description){

        image = imageRes;
        NameOfPlace = name;
        DescriptionOfPlace = Description;
    }

    public int getImage() {
        return image;
    }

    public String getDescriptionOfPlace() {
        return DescriptionOfPlace;
    }

    public String getNameOfPlace() {
        return NameOfPlace;
    }

    public void setDescriptionOfPlace(String descriptionOfPlace) {
        DescriptionOfPlace = descriptionOfPlace;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setNameOfPlace(String nameOfPlace) {
        NameOfPlace = nameOfPlace;
    }
}
