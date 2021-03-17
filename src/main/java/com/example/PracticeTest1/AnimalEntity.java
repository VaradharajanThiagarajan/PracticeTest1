package com.example.PracticeTest1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String animalType;
    private String mood;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getMood() {
        return mood;
    }

    public AnimalEntity(String name, String animalType, String mood) {
        this.name = name;
        this.animalType = animalType;
        this.mood = mood;
       // System.out.println("Inside Entity" + name+animalType+mood+this.id);
    }
}
