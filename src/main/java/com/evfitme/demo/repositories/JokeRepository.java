package com.evfitme.demo.repositories;

import com.evfitme.demo.entities.JokeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.LongSummaryStatistics;

/**
 * Created by ryanwatson on 7/1/17.
 */
public interface JokeRepository extends PagingAndSortingRepository<JokeEntity, Long> {

}
