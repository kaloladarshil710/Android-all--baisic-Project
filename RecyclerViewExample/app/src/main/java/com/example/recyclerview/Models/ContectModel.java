package com.example.recyclerview.Models;

public class ContectModel {
    int pic;
    String text;

    public ContectModel(int pic,String text){
        this.pic=pic;
        this.text=text;
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
