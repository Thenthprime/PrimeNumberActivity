package edu.psu.swen888.contentproviderpractice;

import java.io.Serializable;

public class Event implements Serializable {
    private String name;
    private int phone;

    public Event(String name, int phone){
        this.name = name;
        this.phone = phone;
    }

    //getter methods for the event details

    public String getName(){
        return name;
    }
    public int getPhone(){
        return phone;
    }
}
