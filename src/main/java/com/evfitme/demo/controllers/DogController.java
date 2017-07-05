package com.evfitme.demo.controllers;

import com.evfitme.demo.DTO.Dog;
import com.evfitme.demo.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


/**
 * Created by ryanwatson on 7/4/17.
 */
@Controller
public class DogController {
    private static final String BASE_PATH = "/api/dogs";

    private DogService dogService;

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @RequestMapping(method = RequestMethod.GET, value = BASE_PATH, produces = "application/json")
    @ResponseBody
    public Iterable<Dog> listDogs(Pageable pageable){
        return dogService.list(pageable);

    }
    @RequestMapping(method = RequestMethod.GET, value = BASE_PATH + "/hello")
    @ResponseBody
    public String canIGetAString(Pageable pageable){
        return "Hello World";

    }


}
