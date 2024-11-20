package com.example.tajhotel;

public class RecipeModel {
    int pic ;
    String button;


    public RecipeModel(int pic , String button) {
        this.button = button;
        this.pic = pic;

    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
    public String getButtonText() {
        return button;
    }
}
