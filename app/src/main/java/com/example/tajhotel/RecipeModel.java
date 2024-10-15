package com.example.tajhotel;

public class RecipeModel {
    int pic ;
    String text;

    public RecipeModel(String text, int pic) {
        this.text = text;
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
