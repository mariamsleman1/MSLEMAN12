package com.example.resturantmariam;


import org.w3c.dom.NodeList;
import java.util.ArrayList;

enum Type {arabianbreakfast, turkishbreakfast  , othermaelsofbreakfast};
public class breakfast {
    private Type type;
    public breakfast(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }





}
