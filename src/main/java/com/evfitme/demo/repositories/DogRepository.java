package com.evfitme.demo.repositories;


import com.evfitme.demo.entities.DogEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ryanwatson on 7/4/17.
 */
public interface DogRepository extends PagingAndSortingRepository<DogEntity, Long> {
}
