package com.stackroute.domain;

public class Movie {
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void display(){
        System.out.println("Name of the actor: "+ this.actor.name);
        System.out.println("Gender of the actor: "+ this.actor.gender);
        System.out.println("Age of the actor: "+ this.actor.age);
    }
}
