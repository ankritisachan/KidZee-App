package com.example.dell.kidzee;

import java.io.Serializable;

/**
 * Created by DELL on 19-07-2016.
 */
public class Vids implements Serializable {
    int id;
    String name;
    public Vids(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return name;
    }
}