package com.evfitme.demo.DTO;

/**
 * Created by ryanwatson on 7/4/17.
 */
public class Dog {

    private int id;
    private int rows;
    private String name;
    private String human;
    private int age;

    public Dog(int id, int rows, String name, String human, int age) {
        this.id = id;
        this.rows = rows;
        this.name = name;
        this.human = human;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
