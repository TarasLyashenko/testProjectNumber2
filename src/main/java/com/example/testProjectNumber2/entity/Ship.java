package com.example.testProjectNumber2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ship
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String model;
    private int number;
}
