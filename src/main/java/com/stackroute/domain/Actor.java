package com.stackroute.domain;

public class Actor {
    String name;
    String gender;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("Name of the actor: "+ this.name);
        System.out.println("Gender of the actor: "+ this.gender);
        System.out.println("Age of the actor: "+ this.age);
    }
}
