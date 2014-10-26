package com.daoleen.javaee.training.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by alex on 25.5.14.
 */

@Entity
public class Book implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Length(min = 3, max = 32, message = "{domain.name.length.message}")
    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @NotNull
    @Length(min = 5, max = 32, message = "{domain.description.length.message}")
    @Column(name = "description", length = 255, nullable = false)
    private String description;

    @NotNull
    @Column(name = "year", nullable = true)
    private int year;


    // Default constructor
    public Book() {
    }

    // Getters/Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
