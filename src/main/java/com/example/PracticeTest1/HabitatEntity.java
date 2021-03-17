package com.example.PracticeTest1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
public class HabitatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    //@OneToMany
   // private List<AnimalEntity> animalsList = new ArrayList<AnimalEntity>();

    public HabitatEntity(String name, AnimalEntity list1) {
        this.name = name;
    //    this.animalsList.add(list1);
    }
}

