package com.github.istin.schedule.gson;

/**
 * Created by uladzimir_klyshevich on 10/12/15.
 */
public class UniversityModel {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    @Override
    public String toString() {
        return name;
    }
}
