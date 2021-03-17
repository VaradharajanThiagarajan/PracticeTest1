package com.example.PracticeTest1;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StoreController {

    AnimalService aniservice;

    public StoreController(AnimalService aniservice){
        this.aniservice = aniservice;
    }

    @PostMapping("addAnimals")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAnimals(@RequestBody AnimalDto animDto){
        System.out.println(animDto.getName());
        aniservice.addAnimal(animDto);
    }

    @GetMapping("listAnimals")
    //@ResponseStatus(HttpStatus.))
    public String listAnimals(@RequestParam(value = "mood") String mood,
                              @RequestParam(value = "animType") String animType){
        System.out.println("parameter"+mood);
        System.out.println("parameter2"+animType);
        List<AnimalEntity> a = aniservice.returnAnimal(mood,animType);
        System.out.println("final return is coming"+a.toString());
        return a.get(0).getName();

    }

}
