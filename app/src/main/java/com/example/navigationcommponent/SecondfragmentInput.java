package com.example.navigationcommponent;


import java.io.Serializable;

public class SecondfragmentInput implements Serializable {

    private String secondfragmenttext;

    public SecondfragmentInput(String secondfragmenttext){
        this.secondfragmenttext=secondfragmenttext;
    }

    public String getSecondfragmenttext() {
        return secondfragmenttext;
    }

    public void setSecondfragmenttext(String secondfragmenttext) {
        this.secondfragmenttext = secondfragmenttext;
    }
}
