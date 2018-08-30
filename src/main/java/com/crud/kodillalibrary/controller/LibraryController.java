package com.crud.kodillalibrary.controller;

import com.crud.kodillalibrary.domain.*;

import com.crud.kodillalibrary.exceptions.ReaderNotFoundException;
import com.crud.kodillalibrary.mapper.ReaderMapper;
import com.crud.kodillalibrary.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.crud.kodillalibrary.exceptions.ReaderNotFoundException.READER_NOT_FOUND_EXCEPTION;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping ("/v1/library")
public class LibraryController {

    @Autowired
    DbService dbService;

    @Autowired
    ReaderMapper readerMapper;

    @RequestMapping(method = RequestMethod.POST, value = "/readers", consumes = APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        dbService.saveReader(readerMapper.mapToReader(readerDto));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/readers/{readerId}")
    public ReaderDto getReader (@PathVariable Long readerId) throws ReaderNotFoundException {
        return readerMapper.mapToReaderDto(dbService.getReader(readerId).orElseThrow(() -> new ReaderNotFoundException(READER_NOT_FOUND_EXCEPTION + " for reader_id " + readerId )));
    }

    @RequestMapping(method=RequestMethod.GET, value = "/readers")
    public List<ReaderDto> getReaders(){
        return readerMapper.mapToReaderDtoList(dbService.getAllReaders());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/readers/{readerId}")
    public void deleteReader (@PathVariable Long readerId){
        dbService.deleteReader(readerId);
    }

    @RequestMapping (method= RequestMethod.PUT, value = "/readers")
    public ReaderDto updateReader (@RequestBody ReaderDto readerDto){
        return readerMapper.mapToReaderDto(dbService.updateReader(readerMapper.mapToReader(readerDto)));
    }

}