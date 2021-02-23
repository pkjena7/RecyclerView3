package com.example.recyclerview3;

import android.widget.ImageView;

public class Model {
    int image;
    String txt;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Model(int image, String txt) {
        this.image = image;
        this.txt = txt;
    }
}
