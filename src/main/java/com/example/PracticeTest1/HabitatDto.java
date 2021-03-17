package com.example.PracticeTest1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class HabitatDto {
    private String name;
    private List<AnimalDto> animalo = new ArrayList<AnimalDto>();


    public HabitatDto(String habname, AnimalDto antype) {
        this.name = habname;
        animalo.add(antype);
    }
}
