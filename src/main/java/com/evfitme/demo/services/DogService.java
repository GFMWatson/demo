package com.evfitme.demo.services;

import com.evfitme.demo.DTO.Dog;
import com.evfitme.demo.entities.DogEntity;
import com.evfitme.demo.repositories.DogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryanwatson on 7/4/17.
 */
@Service
public class DogService {
    private DogRepository dogRepository;
    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> list(Pageable pageable){
        Page<DogEntity> page = dogRepository.findAll(pageable);
        List<Dog> doglist = new ArrayList<>();
        page.forEach((a)->{
            System.out.println(a.toString());
                    doglist.add(new Dog(a.getId(), a.getRows(),
                            a.getName(), a.getHuman(), a.getAge()));
                }
                );
        return doglist;

    }
}

