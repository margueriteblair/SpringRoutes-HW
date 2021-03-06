package com.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="")
public class Alien {
    private int aid;
    private String aname;
    private String tech;

    @Autowired
    @Qualifier("laptop")
    private Laptop laptop;

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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public void show() {
        System.out.println("In show");
        laptop.compile();
    }
}
