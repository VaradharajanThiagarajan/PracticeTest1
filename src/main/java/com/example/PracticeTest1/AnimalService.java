package com.example.PracticeTest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalrepos;

    @Autowired
    public AnimalService(AnimalRepository animalrepos) {
        this.animalrepos = animalrepos;
    }

    public void addAnimal(AnimalDto animDto) {
       // System.out.println("service method"+animDto.getName());
        AnimalEntity nam1 = new AnimalEntity(animDto.getName(),animDto.getAnimalType(),animDto.getMood());
       // System.out.println("Entity object id vaue is:" +nam1.getId());
        AnimalEntity savedAnimal = animalrepos.save(nam1);
       // System.out.println("after save repos" + savedAnimal.getId());

    }

    public List<AnimalEntity> returnAnimal(String mood, String animType) {
        System.out.println("isnideservice"+mood);
        return animalrepos.findByMoodAndType(mood,animType);

    }


}
