package com.example.PracticeTest1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestZoo {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void postAnimalAndHabitat() throws Exception{
        //Setup
        AnimalDto a1 = new AnimalDto("dog","walking","happy");
        AnimalDto a2 = new AnimalDto("bird","flying","happy");
        HabitatDto h1 = new HabitatDto("land",a1);
        HabitatDto h2 = new HabitatDto("nest",a2);
        //StoreController c1 = new StoreController();
        //Execute
        mockMvc.perform(post("/addAnimals")
                .content(objectMapper.writeValueAsString(a1))
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());

    }

    @Test
    public void getAnimal() throws Exception{
        //Setup
        AnimalDto a1 = new AnimalDto("dog","walking","happy");
        AnimalDto a2 = new AnimalDto("bird","flying","happy");

        //Execute
        mockMvc.perform(post("/addAnimals")
                .content(objectMapper.writeValueAsString(a1))
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());
        mockMvc.perform(post("/addAnimals")
                .content(objectMapper.writeValueAsString(a2))
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());

        mockMvc.perform(get("/listAnimals")
                .param("mood","happy")
                .param("animType","walking"));


    }

}
