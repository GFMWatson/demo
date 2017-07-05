package com.evfitme.demo.entities;

import javax.persistence.*;

/**
 * Created by ryanwatson on 7/1/17.
 */
@Entity
@Table(name = "jokes")
public class JokeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "punchline", nullable = false)
    private String punchline;

    public JokeEntity() {}

    public JokeEntity(String first, String last) {
        this.content = first;
        this.punchline = last;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
