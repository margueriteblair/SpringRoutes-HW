package com.springboot;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
    private int aid;
    private String aname;
    private String tech;

    public Alien() {
        super();
        System.out.println("Object created");
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public String getTech() {
        return tech;
    }

    public void show() {
        System.out.println("In show");
    }
}
