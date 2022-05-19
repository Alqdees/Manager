package com.company;

import java.util.ArrayList;

public class Teacher {
    public ArrayList<Model> teachers;


    public void add(String id, String name, String department) {
        if (id.isEmpty() && name.isEmpty() && department.isEmpty()) {
            return;
        } else {
            Model model = new Model(id, name, department);
            teachers = new ArrayList<>();
            teachers.add(model);
        }


    }

    public void remove(String name) {
        teachers = new ArrayList<>();
        teachers.remove(name);
    }

    public void teacherView() {
        if (teachers.isEmpty())
            return;
        else {
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println(teachers.get(i));
            }

        }
    }
    public void searchTeacher(String id , String name)
    {
        if (teachers == null){
            return;
        }else {

            for (int i = 0; i < teachers.size(); i++) {
              if (teachers.get(i).getId().equalsIgnoreCase(id) || teachers.get(i).getName().equalsIgnoreCase(name)){
                  System.out.println(teachers.get(i));
                  break;
              }
            }


        }
    }
    public void addSession(String id,String name){

        if (id.isEmpty()) {
            return;
        } else {
            for (int i =0 ;i<teachers.size();i++) {
                if (!teachers.get(0).getId().equalsIgnoreCase(id)) {
                    System.out.println("لايوجد محاضر بهذا الرقم");
                }else {
                    ArrayList<Model> models = new ArrayList<>();
                    Model session = new Model(id,name);
                    models.add(session);
                    for (Model m : models) {
                        System.out.println(m.getId());
                        System.out.println(m.getName());
                    }
                }
            }

        }
    }
    public void deleteSession(String id){
        ArrayList<Model> models = new ArrayList<>();
        Model model = new Model(id);
        models.remove(model);
    }

}

