package com.company;

import java.util.ArrayList;

public class Model {
    private String id;
    private String name;
    private String department;
    ArrayList<Model> models;
    public Model(String id,String name,String department){
        this.department = department;
        this.id = id;
        this.name = name;
        models = new ArrayList<>();
    }

    public Model(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public Model(String id){
        this.id= id;
    }
    public Model(){
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
