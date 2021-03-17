package com.example.PracticeTest1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnimalDto {
    private String name;
    private String animalType;
    private String mood;

    public AnimalDto(String name, String animalType, String mood) {
        this.name = name;
        this.animalType = animalType;
        this.mood = mood;
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
}
