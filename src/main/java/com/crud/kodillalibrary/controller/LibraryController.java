package com.crud.kodillalibrary.controller;

import com.crud.kodillalibrary.domain.*;
import com.crud.kodillalibrary.mapper.ReaderMapper;
import com.crud.kodillalibrary.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping ("/v1/library")
public class LibraryController {

    @Autowired
    DbService dbService;

    @Autowired
    ReaderMapper readerMapper;

    @RequestMapping(method = RequestMethod.POST, value = "/createReader", consumes = APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        dbService.saveReader(readerMapper.mapToReader(readerDto));
    }
}