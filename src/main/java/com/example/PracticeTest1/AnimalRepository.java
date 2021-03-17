package com.example.PracticeTest1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
    @Query("select a from AnimalEntity a where a.mood = ?1 and a.animalType = ?2"  )
    public List<AnimalEntity> findByMoodAndType(String mood, String animType);


}
