package com.evfitme.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by ryanwatson on 7/4/17.
 */
@Entity
@Table(name="dogs")
public class DogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "rows", nullable = false)
    private int rows;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "human", nullable = false)
    private String human;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "created", updatable = false, insertable = false)
    private LocalDate created;

    public DogEntity(){

    }

    public DogEntity(int rows, String name, String human, int age, LocalDate created) {
        this.rows = rows;
        this.name = name;
        this.human = human;
        this.age = age;
        this.created = created;
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

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
